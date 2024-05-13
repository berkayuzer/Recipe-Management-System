package src.Modification;

import src.RecipeProduct;

import java.util.List;

public class ModifyTagsCommand implements Command{
    private RecipeProduct recipeProduct;
    private List<String> oldTags;
    private List<String> newTags;

    public ModifyTagsCommand(RecipeProduct recipeProduct, List<String> newTags) {
        this.recipeProduct = recipeProduct;
        this.newTags = newTags;
        this.oldTags = recipeProduct.getTags();
    }

    @Override
    public void execute() {
        recipeProduct.setTags(newTags);
    }

    @Override
    public void undo() {
        recipeProduct.setTags(oldTags);
    }

}
