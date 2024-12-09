package recipebuilderpack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBuilder recipe = new RecipeBuilder();

        System.out.println("Welcome to the Recipe Builder!");

        System.out.println("Add up to 5 ingredients. Type 'done' to finish adding ingredients.");
        while (true) {
            System.out.print("Enter an ingredient: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) break;
            recipe.addIngredient(input);
        }

        System.out.println("Add cooking steps. Type 'done' to finish adding steps.");
        while (true) {
            System.out.print("Enter a step: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) break;
            recipe.addStep(input);
        }

        recipe.displayRecipe();

        System.out.print("\nCheck if an ingredient is missing. Enter an ingredient name or 'done': ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) break;

            if (recipe.isIngredientMissing(input)) {
                System.out.println("Ingredient is missing: " + input);
            } else {
                System.out.println("Ingredient is already added: " + input);
            }
        }

        scanner.close();
        System.out.println("Thank you for using Recipe Builder!");
    }
}
