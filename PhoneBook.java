import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    public HashMap<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    // Добавить запись
    public void add(String name, String phoneNumber) {
        // Если фамилия уже есть в справочнике, добавить в список
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }
    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }
}
