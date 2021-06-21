package homework.lesson1;

public class Treadmill {
    private double lengthLimit;

    public Treadmill(double lengthLimit) {
        this.lengthLimit = lengthLimit;
    }

    public double getDifficulty() {
        return lengthLimit;
    }
}
