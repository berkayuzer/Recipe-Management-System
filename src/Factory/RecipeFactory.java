package src.Factory;

import src.Product.AppetizerProduct;
import src.Product.DessertProduct;
import src.Product.MainDishProduct;
import src.Recipe;

import java.util.List;

public interface RecipeFactory{
    Recipe createRecipe(List<String> ingredients, String cookingInstructions, int servingSize,
                      List<String> categories, List<String> tags, float avgRating);
}

