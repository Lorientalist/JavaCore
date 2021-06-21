package homework.lesson1;

public class Common {
    private final static String ACTION_TYPE_RUN = "пробежал(а)";
    private final static String ACTION_TYPE_JUMP = "прыгнул(а)";

    public static boolean runAction(double length, double runLimit, String name) {
        return Common.doAction(length, runLimit, name, Common.ACTION_TYPE_RUN);
    }

    public static boolean jumpAction(double height, double jumpLimit, String name) {
        return Common.doAction(height, jumpLimit, name, Common.ACTION_TYPE_JUMP);
    }

    private static boolean doAction(double targetActionParam, double actionLimit, String name, String actionType) {
        if (targetActionParam <= 0) {
            System.out.println("Меня зовут " + name + ". Я " + actionType + " 0 метров!");
            return true;
        } else if (actionLimit <= targetActionParam) {
            System.out.println("Меня зовут " + name + ". Я " + actionType + " " + targetActionParam);
            return true;
        } else {
            System.out.println("Меня зовут " + name + ". Я не смог(ла) " + actionType + " " + actionLimit + " метров!");
            return false;
        }
    }
}
