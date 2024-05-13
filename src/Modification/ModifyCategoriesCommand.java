package src.Modification;

import src.RecipeProduct;

import java.util.List;

public class ModifyCategoriesCommand implements Command {
    private RecipeProduct recipeProduct;
    private List<String> oldCategories;
    private List<String> newCategories;

    public ModifyCategoriesCommand(RecipeProduct recipeProduct, List<String> newCategories) {
        this.recipeProduct = recipeProduct;
        this.newCategories = newCategories;
        this.oldCategories = recipeProduct.getCategories();
    }

    @Override
    public void execute() {
        recipeProduct.setCategories(newCategories);
    }

    @Override
    public void undo() {
        recipeProduct.setCategories(oldCategories);
    }
}
