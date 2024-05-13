package src.Factory;

import src.Product.AppetizerProduct;
import src.Recipe;

import java.util.List;

public class AppetizerFactory implements RecipeFactory {
    @Override
    public Recipe createRecipe(List<String> ingredients, String cookingInstructions, int servingSize,
                               List<String> categories, List<String> tags, float avgRating) {
        return new AppetizerProduct(ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }
}