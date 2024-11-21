import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConversionExample {
    public static void main(String[] args) {
        // PART 1: Convert Array to List
        String[] fruitsArray = {"Apple", "Banana", "Cherry", "Date"};

        // Convert the array to an immutable List (backed by the array)
        List<String> immutableList = Arrays.asList(fruitsArray);
        System.out.println("Immutable List: " + immutableList);

        // Convert the array to a mutable List
        List<String> mutableList = new ArrayList<>(immutableList);

        // Add and remove elements in the mutable List
        mutableList.add("Elderberry"); // Adding an element
        mutableList.remove("Banana"); // Removing an element
        System.out.println("Mutable List: " + mutableList);

        // PART 2: Convert List to Array
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");
        fruitsList.add("Date");

        // Convert the List to an array
        String[] newFruitsArray = fruitsList.toArray(new String[0]);

        // Print the array
        System.out.println("List converted to Array: ");
        for (String fruit : newFruitsArray) {
            System.out.println(fruit);
        }
    }
}

/*
Output:
Immutable List: [Apple, Banana, Cherry, Date]
Mutable List: [Apple, Cherry, Date, Elderberry]
List converted to Array: 
Apple
Banana
Cherry
Date
*/
