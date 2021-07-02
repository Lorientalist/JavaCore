package lesson3;

public class Main {
    public static void main(String[] args) {

//        String array[] = new String[]{
//                "fkro",
//                "4895",
//                "iejg35"
//        };

        Integer array[] = new Integer[]{
                1,
                2,
                3
        };


        System.out.println(array[1]);
        System.out.println(array[2]);
        changeValues(array, 1, 2);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("-------------");

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println(appleBox.getWeight());
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        System.out.println("-------------");

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        appleBox.pourIntoAnotherBox(appleBox2);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());

    }

    public static <T> T getByIndex(T[] array, int index) {
        return array[index];
    }

    public static <T> void putByIndex(T[] array, int index, T indexValue) {
        array[index] = indexValue;
    }

    public static <T> void changeValues(T[] array, int i, int j) {
        T i1 = getByIndex(array, i);
        T j1 = getByIndex(array, j);
        putByIndex(array, i, j1);
        putByIndex(array, j, i1);
    }


}
