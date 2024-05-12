package src.Rating;

import java.util.HashMap;
import java.util.Map;

// Singleton class for managing recipe ratings
public class RecipeRatingManager {
    private static RecipeRatingManager instance;
    private Map<String, Integer> recipeRatings;

    private RecipeRatingManager() {
        // Private constructor to prevent instantiation
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
    public void rateRecipe(String recipeName, int rating) {
        // Check if the recipe already has ratings
        if (recipeRatings.containsKey(recipeName)) {
            // If the recipe already has ratings, update the average rating
            int currentRating = recipeRatings.get(recipeName);
            int newRating = (currentRating + rating) / 2; // Example calculation (average)
            recipeRatings.put(recipeName, newRating);
        } else {
            // If it's the first rating, simply add it to the map
            recipeRatings.put(recipeName, rating);
        }
    }

    // Method to get the impact property of a recipe
    public int getImpactProperty(String recipeName) {
        if (recipeRatings.containsKey(recipeName)) {
            return recipeRatings.get(recipeName);
        } else {
            return 0; // Default impact property if no ratings exist
        }
    }
}
