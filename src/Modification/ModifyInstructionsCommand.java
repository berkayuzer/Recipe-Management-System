package src.Modification;

import src.RecipeProduct;

public class ModifyInstructionsCommand implements Command {
    private RecipeProduct recipeProduct;
    private String oldCookingInstructions;
    private String newCookingInstructions;

    public ModifyInstructionsCommand(RecipeProduct recipeProduct, String newCookingInstructions) {
        this.recipeProduct = recipeProduct;
        this.newCookingInstructions = newCookingInstructions;
        this.oldCookingInstructions = recipeProduct.getInstructions();
    }

    @Override
    public void execute() {
        recipeProduct.setInstructions(newCookingInstructions);
    }

    @Override
    public void undo() {
        recipeProduct.setInstructions(oldCookingInstructions);
    }
}
