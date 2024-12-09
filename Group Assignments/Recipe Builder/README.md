
# Recipe Builder

## Description
The Recipe Builder is a simple Java program designed to help users create and manage recipes interactively. Users can add ingredients, cooking steps, and check for missing ingredients. The program ensures a streamlined experience with clear instructions and feedback.

## Author
- **Nicolas Peeples**

## How It Works

### **Main Class**
- **File**: `Main.java`
- **Purpose**: Acts as the entry point of the program.
  - Provides a user interface to interact with the Recipe Builder.
  - Allows users to:
    - Add up to 5 ingredients.
    - Add cooking steps interactively.
    - Check if specific ingredients are missing.
    - Display the final recipe, including ingredients and steps.

### **RecipeBuilder Class**
- **File**: `RecipeBuilder.java`
- **Purpose**: Handles the core functionality of managing recipes.
  - **Attributes**:
    - `HashSet<String> ingredients`: Ensures unique ingredients and limits to 5 items.
    - `ArrayList<String> steps`: Stores the steps for cooking.
  - **Methods**:
    - `addIngredient(String ingredient)`: Adds an ingredient if it's unique and within the limit.
    - `addStep(String step)`: Appends a step to the recipe.
    - `displayRecipe()`: Prints the list of ingredients and cooking steps in order.
    - `isIngredientMissing(String ingredient)`: Checks if a specific ingredient has been added.

## Features
- Add up to 5 unique ingredients with interactive feedback.
- Add unlimited cooking steps.
- Display the full recipe in a user-friendly format.
- Check for missing ingredients from the list.

## Example Usage
1. Run the program and follow the prompts to:
   - Add ingredients (e.g., "Salt", "Pepper").
   - Add steps (e.g., "Mix ingredients", "Cook on medium heat").
   - Display the recipe.
   - Check for missing ingredients (e.g., "Oil").

Enjoy managing your recipes with this simple yet effective Java program!
