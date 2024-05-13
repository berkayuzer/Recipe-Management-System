package src.Factory;

import src.Product.MainDishProduct;
import src.Recipe;

import java.util.List;

public class MainDishFactory implements RecipeFactory {
    @Override
    public Recipe createRecipe(List<String> ingredients, String cookingInstructions, int servingSize,
                               List<String> categories, List<String> tags, float avgRating) {
        return new MainDishProduct(ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }
}
