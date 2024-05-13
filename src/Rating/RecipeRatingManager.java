package src.Rating;
import src.RecipeProduct;

import java.util.HashMap;
import java.util.Map;

public class RecipeRatingManager {
    static private RecipeRatingManager instance;
    private Map<RecipeProduct, Float> recipeRatings;

    // Private constructor to prevent instantiation from outside
    private RecipeRatingManager() {
        recipeRatings = new HashMap<>();
    }

    // Method to get the singleton instance
    public static RecipeRatingManager getInstance() {
        if (instance == null) {
            instance = new RecipeRatingManager();
        }
        return instance;
    }

    // Method to rate a recipe
    public void rateRecipe(RecipeProduct recipeProduct, float rating) {
        recipeRatings.put(recipeProduct, rating);
    }

    // Method to compute the average rating of a recipe
    public float computeAvgRating(RecipeProduct recipeProduct) {
        float sum = 0;
        int count = 0;
        for (Map.Entry<RecipeProduct, Float> entry : recipeRatings.entrySet()) {
            if (entry.getKey().equals(recipeProduct)) {
                sum += entry.getValue();
                count++;
            }
        }
        if (count == 0) {
            return 0; // No ratings available
        }
        float avg = sum / count;
        recipeProduct.setAvgRating(avg);
        return avg;
    }
}
