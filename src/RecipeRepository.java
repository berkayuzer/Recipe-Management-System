package src;

import src.Search.SearchStrategy;

import java.util.ArrayList;
import java.util.List;

public class RecipeRepository {
    private List<Recipe> recipes;

    public RecipeRepository() {
        this.recipes = new ArrayList<>();
    }

    // Add a recipe to the repository
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    // Remove a recipe from the repository
    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    // Update a recipe in the repository
    public void updateRecipe(Recipe oldRecipe, Recipe newRecipe) {
        int index = recipes.indexOf(oldRecipe);
        if (index != -1) {
            recipes.set(index, newRecipe);
        }
    }

    // Get all recipes in the repository
    public List<Recipe> getAllRecipes() {
        return new ArrayList<>(recipes); // Return a copy to prevent modification of the internal list
    }

    // Search recipes based on a keyword using a search strategy
    public List<Recipe> searchRecipes(SearchStrategy searchStrategy, String keyword) {
        return searchStrategy.search(recipes, keyword);
    }
}
