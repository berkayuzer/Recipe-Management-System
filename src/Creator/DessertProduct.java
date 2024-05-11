package src.Creator;

import src.Recipe;

import java.util.List;

public class DessertProduct extends Recipe {
    public DessertProduct(List<String> ingredients, String cookingInstructions, int servingSize, List<String> categories, List<String> tags, float avgRating) {
        super(ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }
}
