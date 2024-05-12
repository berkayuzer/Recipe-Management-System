package src.Rating;
import src.Recipe;

import java.util.HashMap;
import java.util.Map;

public class RecipeRatingManager {
    private RecipeRatingManager instance;
    private Map<Recipe, Float> recipeRatings;

    // Private constructor to prevent instantiation from outside
    private RecipeRatingManager() {
        recipeRatings = new HashMap<>();
    }

    // Method to get the singleton instance
    public RecipeRatingManager getInstance() {
        if (instance == null) {
            instance = new RecipeRatingManager();
        }
        return instance;
    }

    // Method to rate a recipe
    public void rateRecipe(Recipe recipe, float rating) {
        recipeRatings.put(recipe, rating);
    }

    // Method to compute the average rating of a recipe
    public float computeAvgRating(Recipe recipe) {
        float sum = 0;
        int count = 0;
        for (Map.Entry<Recipe, Float> entry : recipeRatings.entrySet()) {
            if (entry.getKey().equals(recipe)) {
                sum += entry.getValue();
                count++;
            }
        }
        if (count == 0) {
            return 0; // No ratings available
        }
        float avg = sum / count;
        Recipe.setAvgRating(avg);
        return avg;
    }
}
