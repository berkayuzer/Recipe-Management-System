package src.Modification;

import src.Recipe;

import java.util.List;

public class ModifyIngredientsCommand implements Command {
    private Recipe recipe;
    private List<String> oldIngredients;
    private List<String> newIngredients;

    public ModifyIngredientsCommand(Recipe recipe, List<String> newIngredients) {
        this.recipe = recipe;
        this.newIngredients = newIngredients;
        this.oldIngredients = recipe.getIngredients();
    }

    @Override
    public void execute() {
        recipe.setIngredients(newIngredients);
    }

    @Override
    public void undo() {
        recipe.setIngredients(oldIngredients);
    }
}
