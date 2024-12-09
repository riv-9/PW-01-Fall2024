
# Shopping List App

## Description
The Shopping List App is a Java-based console application that allows users to organize their shopping items into categories, add items to specific categories, mark items as bought, and display the entire shopping list. It provides a simple and interactive interface for managing shopping tasks efficiently.

## Authors
- **Austin Margiela**
- **Mathew Monasterski**

## How It Works

### **Core Functionalities**
1. **Add a Category**:
   - Users can create new categories for their shopping items.
   - Each category is unique and stored in a `HashMap` with the category name as the key.

2. **Add an Item to a Category**:
   - Users can add specific items to a category.
   - If the category does not exist, users are prompted to create it first.

3. **Mark an Item as Bought**:
   - Users can mark an item as bought, which removes it from the category list.

4. **Display the Shopping List**:
   - Displays all categories and their respective items.
   - Indicates if the shopping list is empty.

5. **Exit**:
   - Safely terminates the program.

### **Key Components**
- **`HashMap<String, ArrayList<String>> shoppingList`**:
  - A `HashMap` that organizes categories as keys and their associated items as values (stored in `ArrayList`).

- **Interactive Menu**:
  - Offers users a clear set of options to interact with the app, including adding categories, adding items, marking items as bought, and viewing the shopping list.

## Example Usage
1. Start the program:
   - A welcome message and a menu are displayed.
2. Add a new category:
   - Example: "Vegetables".
3. Add items to the category:
   - Example: "Carrots", "Tomatoes".
4. Mark an item as bought:
   - Example: Mark "Carrots" as bought from the "Vegetables" category.
5. Display the shopping list:
   - Example:
     ```
     - Vegetables: [Tomatoes]
     ```
6. Exit the application:
   - Displays a thank-you message.

## Features
- Organize shopping items into categories.
- Add and remove items dynamically.
- Interactive console interface for ease of use.

Enjoy managing your shopping tasks with this straightforward and efficient app!
