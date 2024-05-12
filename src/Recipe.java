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
    public void createRecipe(String recipeName){
    this.recipeName = recipeName;
    }
    public List<String> getIngredients(){
    return ingredients;
    }
    public void setIngredients(List<String> ingredients){
        this.ingredients = ingredients;
    }
    public String getInstructions(){
        return cookingInstructions;
    }
    public void setInstructions(String cookingInstructions){
    this.cookingInstructions = cookingInstructions;
    }
    int getServingSize(){
        return servingSize;
    }
    public void setCategories(List<String> categories){
        this.categories = categories;
    }
    public List<String> getCategories(){
        return categories;
    }
    public void setTags(List<String> tags){
        this.tags=tags;
    }

    public List<String> getTags(){
        return tags;
    }
    public void setAvgRating(float avgRating){ this.avgRating=avgRating; }
}

