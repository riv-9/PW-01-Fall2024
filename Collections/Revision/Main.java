import java.util.*;

// A class to revise Java collections and their usage
class RevisingCollection {
    HashMap<Integer, String> intStringMap; // Maps integers to strings
    LinkedHashSet<String> stringSet;      // Stores unique strings
    ArrayList<Integer> intList;           // Stores integers
    HashSet<HashMap> mapSet;              // Stores multiple HashMaps
    ArrayList<HashMap> mapList;           // Stores multiple HashMaps in a list

    // Constructor to initialize all collections
    public RevisingCollection() {
        intStringMap = new LinkedHashMap<>(); // Keeps insertion order
        stringSet = new LinkedHashSet<>();    // Unique strings in insertion order
        intList = new ArrayList<>();          // Allows duplicates
        mapSet = new LinkedHashSet<>();       // Unique maps
        mapList = new ArrayList<>();          // Allows duplicates
    }
}

// Main class to demonstrate collection operations
public class Main {
    public static void main(String[] args) {
        RevisingCollection o1 = new RevisingCollection();

        // Example: Adding unique strings to the set
        o1.stringSet.add("Hello");
        o1.stringSet.add("World");
        o1.stringSet.add("Java");
        o1.stringSet.add("C"); // "Java" is ignored as it is a duplicate

        // Print the string set
        System.out.println("String Set: " + o1.stringSet);

        // Example: Adding integers to the list
        o1.intList.add(100);
        o1.intList.add(200);
        o1.intList.add(300);
        o1.intList.add(300); // Duplicates are allowed

        // Print the integer list
        System.out.println("Integer List: " + o1.intList);

        // Combine intList and stringSet into a HashMap
        Iterator<String> stringIt = o1.stringSet.iterator();
        for (int i = 0; i < o1.intList.size() && stringIt.hasNext(); i++) {
            o1.intStringMap.put(o1.intList.get(i), stringIt.next());
        }

        // Print the combined map
        System.out.println("Combined Map (intList -> stringSet):");
        o1.intStringMap.entrySet()
                .stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        // Adding HashMaps to a set and a list
        o1.mapSet.add(o1.intStringMap); // Add the combined map
        o1.mapSet.add(new HashMap<String, Integer>() {{
            put("Extra", 123);
        }});

        // Print all maps in the set
        System.out.println("Maps in the set:");
        System.out.println(o1.mapSet);
    }
}
