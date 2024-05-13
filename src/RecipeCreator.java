package src;


import java.util.List;

public abstract class RecipeCreator {
    public RecipeProduct orderRecipe(String name, List<String> ingredients, String cookingInstructions, int servingSize,
                                      List<String> categories, List<String> tags) {
        return RecipeCreatorConcrete.createRecipe(name,ingredients,cookingInstructions,servingSize,categories,tags);
    }


    public void createIngredients(List<String> ingredients) {

    }
}