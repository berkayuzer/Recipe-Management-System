package src;

import java.util.ArrayList;
import java.util.List;

public class RecipeRepository {
    private List<Recipe> recipes;

    public RecipeRepository() {
        this.recipes = new ArrayList<>();
    }

    // Add a recipe to the repository
    public void saveRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    // Get all recipes in the repository
    public List<Recipe> getAllRecipes() {
        return new ArrayList<>(recipes); // Return a copy to prevent modification of the internal list
    }
}
