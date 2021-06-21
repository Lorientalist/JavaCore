package homework.lesson1;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat(2, 10, "Барсик"),
                new Cat(15, 19, "ЛуЛу")
        };
        Human[] humans = new Human[]{
                new Human(200, 50, "Василий"),
                new Human(-2, 20, "Лариса Ивановна"),
                new Human(1, 0.1, "Машенька")
        };
        Bot[] bots = new Bot[]{
                new Bot(500, 10, "R2D2"),
                new Bot(3412, 1, "C3PO"),
                new Bot(12, 452, "BANKA")
        };

        Wall[] walls = new Wall[]{
                new Wall(23),
                new Wall(1),
                new Wall(3)
        };
        Treadmill[] treadmills = new Treadmill[]{
                new Treadmill(1343),
                new Treadmill(132),
                new Treadmill(0)
        };

        /////////////////////////////////////////////////////
        for (Cat cat : cats) {
            for (Treadmill treadmill : treadmills) {
                if (!cat.run(treadmill.getDifficulty())) {
                    break;
                }
            }
        }
        for (Cat cat : cats) {
            for (Wall wall : walls) {
                if (!cat.jump(wall.getDifficulty())) {
                    break;
                }
            }
        }
        /////////////////////////////////////////////////////
        for (Human human : humans) {
            for (Treadmill treadmill : treadmills) {
                if (!human.run(treadmill.getDifficulty())) {
                    break;
                }
            }
        }
        for (Human human : humans) {
            for (Wall wall : walls) {
                if (!human.jump(wall.getDifficulty())) {
                    break;
                }
            }
        }
        /////////////////////////////////////////////////////
        for (Bot bot : bots) {
            for (Treadmill treadmill : treadmills) {
                if (!bot.run(treadmill.getDifficulty())) {
                    break;
                }
            }
        }
        for (Bot bot : bots) {
            for (Wall wall : walls) {
                if (!bot.jump(wall.getDifficulty())) {
                    break;
                }
            }
        }
    }
}
