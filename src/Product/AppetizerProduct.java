package src.Product;

import src.Recipe;

import java.util.List;

public class AppetizerProduct extends Recipe {

    public AppetizerProduct(String name, List<String> ingredients, String cookingInstructions, int servingSize, List<String> categories, List<String> tags, float avgRating) {
        super(name, ingredients, cookingInstructions, servingSize, categories, tags, avgRating);
    }

}
