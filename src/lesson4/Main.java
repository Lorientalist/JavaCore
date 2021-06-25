package lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


//        PhoneBook[] people = new PhoneBook[13];
//        people[0] = new PhoneBook("Иванов", 8652685);
//        people[1] = new PhoneBook("Петров", 5978621);
//        people[2] = new PhoneBook("Сидорова", 5987325);
//        people[3] = new PhoneBook("Уткина", 3259876);
//        people[4] = new PhoneBook("Татаренко", 9578964);
//        people[5] = new PhoneBook("Михайлов", 2578945);
//        people[6] = new PhoneBook("Куркина-Птицына", 3169258);
//        people[7] = new PhoneBook("Крутицкая", 6597812);
//        people[8] = new PhoneBook("Петров", 4956785);
//        people[9] = new PhoneBook("Смит", 1956349);
//        people[10] = new PhoneBook("Кассель", 2945697);
//        people[11] = new PhoneBook("Уткина", 2957896);
//        people[12] = new PhoneBook("Волков", 2978564);
//
//        System.out.println(people[10]);


        List<String> phoneBookList = new ArrayList<>();
        phoneBookList.add("Иванов");
        phoneBookList.add("Петров");
        phoneBookList.add("Сидорова");
        phoneBookList.add("Уткина");
        phoneBookList.add("Татаренко");
        phoneBookList.add("Михайлов");
        phoneBookList.add("Куркина-Птицына");
        phoneBookList.add("Крутицкая");
        phoneBookList.add("Петров");
        phoneBookList.add("Смит");
        phoneBookList.add("Кассель");
        phoneBookList.add("Уткина");
        phoneBookList.add("Волков");
        Map<String, Integer> mapString = new HashMap<>();

        for (String familia : phoneBookList) {
            System.out.println("phoneBookList element is " + familia);
            Integer count = mapString.get(familia);
            if (count == null) {
                count = 1;
            } else {
                count += 1;
            }
            mapString.put(familia, count);
        }
        System.out.println("Element by index 10 is " + phoneBookList.get(10));
        System.out.println("--------");
        mapString.forEach((k, v) -> System.out.println(k + "=" + v));

        System.out.println("--------");

//        Задание 2

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Smith", "598165");
        phoneBook.add("Puff", "165498");
        phoneBook.add("Puff", "894652");
        phoneBook.add("Dr. Dre", "265987");
        phoneBook.add("Dr. Dre", "265987");

        System.out.println(phoneBook.get("Smith"));
        System.out.println(phoneBook.get("Puff"));
        System.out.println(phoneBook.get("Dr. Dre"));
    }

}
