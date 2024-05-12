package src;

import java.util.List;

public class MainDishProduct extends Recipe {
    public MainDishProduct(List<String> ingredients, String cookingInstructions, int servingSize, List<String> categories, List<String> tags, float avgRating) {
        super(ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }
}
