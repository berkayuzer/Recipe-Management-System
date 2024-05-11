package src;

import java.util.ArrayList;
import java.util.List;

public abstract class Recipe {
    List<String> categories = new ArrayList<>(), tags = new ArrayList<>(), ingredients = new ArrayList<>();
    String recipeName, cookingInstructions;
    int servingSize;
    float avgRating;
    void createRecipe(){}

}
