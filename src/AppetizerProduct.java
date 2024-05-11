package src;

import src.Recipe;

import java.util.List;

public class AppetizerProduct extends Recipe {

    public AppetizerProduct(List<String> ingredients, String cookingInstructions, int servingSize, List<String> categories, List<String> tags, float avgRating) {
        super(ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }

}
