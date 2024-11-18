import java.util.HashSet;
 
public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet to store unique grocery items
        HashSet<String> grocerySet = new HashSet<>();
 
        // 1. add(element) - Adding elements to the HashSet
        grocerySet.add("Apples");
        grocerySet.add("Bananas");
        grocerySet.add("Carrots");
        grocerySet.add("Apples"); // Duplicate, will not be added
 
        System.out.println("Initial grocery list: " + grocerySet); // Output: [Apples, Bananas, Carrots]
 
        // 2. contains(element) - Checking if an element exists in the set
        boolean hasBananas = grocerySet.contains("Bananas");
        System.out.println("Grocery list contains Bananas: " + hasBananas); // Output: true
 
        // 3. remove(element) - Removing an element from the set
        grocerySet.remove("Carrots");
        System.out.println("After removing Carrots: " + grocerySet); // Output: [Apples, Bananas]
 
        // 4. isEmpty() - Checking if the set is empty
        boolean isEmpty = grocerySet.isEmpty();
        System.out.println("Is the grocery list empty? " + isEmpty); // Output: false
 
        // 5. size() - Getting the number of elements in the set
        System.out.println("Total items in grocery list: " + grocerySet.size()); // Output: 2
 
        // 6. clear() - Removing all elements from the set
        grocerySet.clear();
        System.out.println("Grocery list after clearing: " + grocerySet); // Output: []
 
        // 7. addAll(Collection) - Adding multiple elements at once
        HashSet<String> newItems = new HashSet<>();
        newItems.add("Oranges");
        newItems.add("Grapes");
        grocerySet.addAll(newItems);
        System.out.println("After adding new items: " + grocerySet); // Output: [Oranges, Grapes]
    }
}
