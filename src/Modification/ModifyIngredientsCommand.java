package src.Modification;

import src.RecipeProduct;

import java.util.List;

public class ModifyIngredientsCommand implements Command {
    private RecipeProduct recipeProduct;
    private List<String> oldIngredients;
    private List<String> newIngredients;

    public ModifyIngredientsCommand(RecipeProduct recipeProduct, List<String> newIngredients) {
        this.recipeProduct = recipeProduct;
        this.newIngredients = newIngredients;
        this.oldIngredients = recipeProduct.getIngredients();
    }

    @Override
    public void execute() {
        recipeProduct.setIngredients(newIngredients);
    }

    @Override
    public void undo() {
        recipeProduct.setIngredients(oldIngredients);
    }
}
