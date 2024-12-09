package ShoppingListApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class ShoppingListApp {
    private static HashMap<String, ArrayList<String>> shoppingList = new HashMap<>();

    

    private static void addCategory(Scanner scanner) {
        System.out.print("Enter the name of the new category: ");
        String category = scanner.nextLine();
        if (!shoppingList.containsKey(category)) {
            shoppingList.put(category, new ArrayList<>());
            System.out.println("Category added: " + category);
        } else {
            System.out.println("Category already exists.");
        }
    }

    private static void addItem(Scanner scanner) {
        System.out.print("Enter the category to add an item to: ");
        String category = scanner.nextLine();
        if (shoppingList.containsKey(category)) {
            System.out.print("Enter the item to add: ");
            String item = scanner.nextLine();
            shoppingList.get(category).add(item);
            System.out.println("Item added: " + item);
        } else {
            System.out.println("Category does not exist. Please add the category first.");
        }
    }

    private static void markItemAsBought(Scanner scanner) {
        System.out.print("Enter the category of the item: ");
        String category = scanner.nextLine();
        if (shoppingList.containsKey(category)) {
            System.out.print("Enter the item to mark as bought: ");
            String item = scanner.nextLine();
            if (shoppingList.get(category).remove(item)) {
                System.out.println("Item marked as bought: " + item);
            } else {
                System.out.println("Item not found in category.");
            }
        } else {
            System.out.println("Category does not exist.");
        }
    }

    private static void displayShoppingList() {
        System.out.println("\nShopping List:");
        if (shoppingList.isEmpty()) {
            System.out.println("The shopping list is empty.");
        } else {
            for (String category : shoppingList.keySet()) {
                System.out.println("- " + category + ": " + shoppingList.get(category));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Shopping List App!");
        
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a category");
            System.out.println("2. Add an item to a category");
            System.out.println("3. Mark an item as bought");
            System.out.println("4. Display shopping list");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCategory(scanner);
                    break;
                case 2:
                    addItem(scanner);
                    break;
                case 3:
                    markItemAsBought(scanner);
                    break;
                case 4:
                    displayShoppingList();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using the Shopping List App!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

