package homework.lesson1;

public class Cat {
    private double runLimit;
    private double jumpLimit;
    private String name;

    public Cat(double runLimit, double jumpLimit, String name) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.name = name;
    }

    public boolean run(double length) {
        return Common.runAction(length, runLimit, name);
    }

    public boolean jump(double height) {
        return Common.jumpAction(height, jumpLimit, name);
    }
}
