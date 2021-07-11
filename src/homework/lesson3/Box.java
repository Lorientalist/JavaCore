package homework.lesson3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double summ = 0;
        for (T fruit : fruits) {
            summ += fruit.getWeight();
        }
        return summ;
    }

    public boolean compare(Box box) {
        return box.getWeight() == this.getWeight();
    }

    public void pourIntoAnotherBox (Box<T> box) {
        for (T fruit: fruits) {
            box.addFruit(fruit);
        } fruits.clear();
    }

}
