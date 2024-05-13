package src.Factory;

import src.Product.DessertProduct;
import src.Recipe;

import java.util.List;

public class DessertFactory implements RecipeFactory {
    @Override
    public Recipe createRecipe(List<String> ingredients, String cookingInstructions, int servingSize,
                               List<String> categories, List<String> tags, float avgRating) {
        return new DessertProduct(ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }
}
