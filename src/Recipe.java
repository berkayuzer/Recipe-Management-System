package src;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public abstract class Recipe {
    List<String> ingredients = new ArrayList<>();
    List<String> categories = new ArrayList<>();
    List<String> tags = new ArrayList<>();
    String recipeName;
    String cookingInstructions;
    int servingSize;
    float avgRating;

}
