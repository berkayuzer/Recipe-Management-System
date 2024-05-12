package src.Creator;

import src.AppetizerProduct;
import src.DessertProduct;
import src.MainDishProduct;
import src.Recipe;

import java.util.List;

interface RecipeFactory{
    Recipe createRecipe(List<String> ingredients, String cookingInstructions, int servingSize,
                      List<String> categories, List<String> tags, float avgRating);
}
class AppetizerFactory implements RecipeFactory{
    @Override
    public Recipe createRecipe(List<String> ingredients, String cookingInstructions, int servingSize,
                               List<String> categories, List<String> tags, float avgRating) {
        return new AppetizerProduct(ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }
}
class DessertFactory implements RecipeFactory{
    @Override
    public Recipe createRecipe(List<String> ingredients, String cookingInstructions, int servingSize,
                               List<String> categories, List<String> tags, float avgRating) {
        return new DessertProduct(ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }
}
class MainDishFactory implements RecipeFactory{
    @Override
    public Recipe createRecipe(List<String> ingredients, String cookingInstructions, int servingSize,
                               List<String> categories, List<String> tags, float avgRating) {
        return new MainDishProduct(ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }
}
