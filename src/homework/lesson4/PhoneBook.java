package homework.lesson4;

import java.util.*;

public class PhoneBook {

    private final Map<String, Set<String>> collection = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        Set<String> phoneNumberList = collection.get(surname);
        if (phoneNumberList == null) {
            phoneNumberList = new HashSet<>();
        }
        phoneNumberList.add(phoneNumber);
        collection.put(surname, phoneNumberList);
    }

    public Set<String> get(String surname) {
        Set<String> phoneNumberList = collection.get(surname);
        if (phoneNumberList == null) {
            phoneNumberList = new HashSet<>();
        }
        return phoneNumberList;
    }

}
