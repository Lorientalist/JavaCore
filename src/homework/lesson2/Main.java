package homework.lesson2;

public class Main {
    public static void main(String[] args)  {

        String[][] myArray = fillArray();
        try {
            createArray(myArray);
        } catch (MyArraySizeException e) {
            System.out.println("Неправильный размер массива");
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение в ячейке " + e.getMessage());
        }
    }

    public static void createArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        if (myArray == null || myArray.length != 4 || myArray[0].length != 4) {
            throw new MyArraySizeException();
        }
        int summ = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summ += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("[" + i + "][" + j + "]");
                }
            }
        }
        System.out.println(summ);
    }

    public static String[][] fillArray() {

        return new String[][]{
                {"27", "167", "1959", "1957164"},
                {"1", "19", "13246", "afyk"},
                {"28", "9564", "2597", "357"},
                {"197", "1987624", "2198", "1000"}
        };

    }


}
