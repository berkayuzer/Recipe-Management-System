package src;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class Recipe {
    List<String> categories, tags, ingredients;
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
    void createRecipe(String recipeName){
    this.recipeName = recipeName;
    }
    List<String> getIngredients(){
    return ingredients;
    }
    void setIngredients(List <String> ingredients){
        this.ingredients = ingredients;
    }
     String getInstructions(){
        return cookingInstructions;
    }
    void setInstructions(String cookingInstructions){
    this.cookingInstructions = cookingInstructions;
    }
    int getServingSize(){
        return servingSize;
    }
    void setCategories(List<String> categories){
        this.categories = categories;
    }
    List<String> getCategories(){
        return categories;
    }
    void setTags(List<String> tags){
        this.tags=tags;
    }

    List<String> getTags(){
        return tags;
    }
    void setAvgRating(float avgRating){
        this.avgRating=avgRating;
    }
}

