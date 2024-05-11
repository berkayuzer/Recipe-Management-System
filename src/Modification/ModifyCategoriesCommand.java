package src.Modification;

import src.Recipe;

import java.util.List;

public class ModifyCategoriesCommand implements Command {
    private Recipe recipe;
    private List<String> oldCategories;
    private List<String> newCategories;

    public ModifyCategoriesCommand(Recipe recipe, List<String> newCategories) {
        this.recipe = recipe;
        this.newCategories = newCategories;
        this.oldCategories = recipe.getCategories();
    }

    @Override
    public void execute() {
        recipe.setCategories(newCategories);
    }

    @Override
    public void undo() {
        recipe.setCategories(oldCategories);
    }
}
