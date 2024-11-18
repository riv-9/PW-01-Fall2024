import java.util.*;
import java.util.stream.Collectors;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap to store names (keys) and phone numbers (values)
        HashMap<String, String> phonebook = new HashMap<>();

        // Adding entries to the map
        phonebook.put("Alice", "123-456-7890");
        phonebook.put("Bob", "987-654-3210");
        phonebook.put("Charlie", "555-666-7777");

        // Printing initial phonebook
        System.out.println("Initial phonebook: " + phonebook);

        // Retrieving and checking entries
        System.out.println("Bob's Number: " + phonebook.get("Bob"));
        System.out.println("Phonebook has Alice: " + phonebook.containsKey("Alice"));
        System.out.println("Phonebook contains number 123-456-7890: " + phonebook.containsValue("123-456-7890"));

        // Removing and printing
        phonebook.remove("Charlie");
        System.out.println("After removing Charlie: " + phonebook);

        // Printing keys, values, and size
        System.out.println("All contacts: " + phonebook.keySet());
        System.out.println("All phone numbers: " + phonebook.values());
        System.out.println("Total contacts: " + phonebook.size());

        // Clearing the map
        phonebook.clear();
        System.out.println("Phonebook after clearing: " + phonebook);

        // Streaming keys, values, and entries
        phonebook.put("Alice", "123-456-7890");
        phonebook.put("Bob", "987-654-3210");
        phonebook.put("Charlie", "555-666-7777");

        // 1. Streaming keys
        phonebook.keySet().stream()
                .forEach(key -> System.out.println("Key: " + key));

        // 2. Streaming values
        phonebook.values().stream()
                .forEach(value -> System.out.println("Value: " + value));

        // 3. Streaming entries
        phonebook.entrySet().stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        // Example operations with streams
        // a. Filter entries
        phonebook.entrySet().stream()
                .filter(entry -> entry.getKey().startsWith("A"))
                .forEach(entry -> System.out.println("Filtered Entry: " + entry.getKey() + " - " + entry.getValue()));

        // b. Collect values into a list
        List<String> phoneNumbers = phonebook.values().stream()
                .collect(Collectors.toList());
        System.out.println("Phone numbers list: " + phoneNumbers);

        // c. Collect filtered entries into a new map
        Map<String, String> filteredMap = phonebook.entrySet().stream()
                .filter(entry -> entry.getKey().startsWith("B"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filtered map: " + filteredMap);
    }
}
