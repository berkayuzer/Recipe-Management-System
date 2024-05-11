package src;

import java.util.ArrayList;
import java.util.List;

public abstract class Recipe {
    List<String> categories = new ArrayList<>(), tags = new ArrayList<>(), ingredients = new ArrayList<>();
    String recipeName, cookingInstructions;
    int servingSize;
    float avgRating;
    public Recipe(List<String> ingredients, String cookingInstructions, int servingSize, List<String> categories, List<String> tags, float avgRating) {
        this.ingredients = ingredients;
        this.cookingInstructions = cookingInstructions;
        this.servingSize = servingSize;
        this.categories = categories;
        this.tags = tags;
        this.avgRating = avgRating;
    }

}

