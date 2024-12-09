package recipebuilderpack;

import java.util.HashSet;
import java.util.ArrayList;

public class RecipeBuilder {
    private HashSet<String> ingredients;
    private ArrayList<String> steps;

    public RecipeBuilder() {
        ingredients = new HashSet<>();
        steps = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        if (ingredients.size() >= 5) {
            System.out.println("You can add up to 5 ingredients.");
        } else if (ingredients.add(ingredient)) {
            System.out.println("Ingredient added: " + ingredient);
        } else {
            System.out.println("Ingredient already exists: " + ingredient);
        }
    }

    public void addStep(String step) {
        steps.add(step);
        System.out.println("Step added: " + step);
    }

    public void displayRecipe() {
        System.out.println("\n Recipe ");
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }

        System.out.println("\nSteps:");
        for (int i = 0; i < steps.size(); i++) {
            System.out.println((i + 1) + ". " + steps.get(i));
        }
    }

    public boolean isIngredientMissing(String ingredient) {
        return !ingredients.contains(ingredient);
    }
}
