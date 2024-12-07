import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //  задание1
        String[] subjects = {
                "Математика", "Физика", "Химия", "Немецкий", "Химия",
                "Черчение", "Немецкий", "Физика", "Математика", "Литература",
                "Английский", "Информатика"
        };
        printUniqueSubjects(subjects);
        //  подсчет количества повторений
        countSubjectOccurrences(subjects);

        //  задание2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Bond", "123-45-45");
        phoneBook.add("Smith", "123-56-78");
        phoneBook.add("Bourne", "345-34-33");
        phoneBook.add("Stirlitz", "569-00-00");
        phoneBook.add("Bond", "007-07-07");

        System.out.println("Bond Contacts: " + phoneBook.get("Bond"));
        System.out.println("Smith Contacts: " + phoneBook.get("Smith"));
        System.out.println("Stirlitz Contacts: " + phoneBook.get("Stirlitz"));
        System.out.println("Not found contacts: " + phoneBook.get("Isaev"));
    }

    public static void printUniqueSubjects(String[] subjects) {
        HashSet<String> uniqueSubjects = new HashSet<>();
        for (String subject : subjects) {
            uniqueSubjects.add(subject);
        }
        System.out.println("Уникальные предметы: " + uniqueSubjects);
    }

    public static void countSubjectOccurrences(String[] subjects) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String subject : subjects) {
            wordCounts.put(subject, wordCounts.getOrDefault(subject, 0) + 1);
        }

        System.out.println("\nКоличество повторений каждого предмета:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

