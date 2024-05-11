package src.Modification;

import src.Recipe;

public class ModifyInstructionsCommand implements Command {
    private Recipe recipe;
    private String oldCookingInstructions;
    private String newCookingInstructions;

    public ModifyInstructionsCommand(Recipe recipe, String newCookingInstructions) {
        this.recipe = recipe;
        this.newCookingInstructions = newCookingInstructions;
        this.oldCookingInstructions = recipe.getInstructions();
    }

    @Override
    public void execute() {
        recipe.setInstructions(newCookingInstructions);
    }

    @Override
    public void undo() {
        recipe.setInstructions(oldCookingInstructions);
    }
}
