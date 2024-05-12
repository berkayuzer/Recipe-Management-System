package src.Search;

import src.Recipe;
import src.Search.SearchStrategy;
import java.util.ArrayList;
import java.util.List;

public class CategorySearchStrategy implements SearchStrategy {
    @Override
    public List<Recipe> search(List<Recipe> recipes, String keyword) {
        List<Recipe> matchingRecipes = new ArrayList<>();

        // Iterate through each recipe in the repository
        for (Recipe recipe : recipes) {
            // Check if the recipe's categories contain the specified keyword
            if (recipe.getCategories().contains(keyword)) {
                // If the keyword matches, add the recipe to the list of matching recipes
                matchingRecipes.add(recipe);
            }
        }

        // Return the list of matching recipes
        return matchingRecipes;
    }

}
