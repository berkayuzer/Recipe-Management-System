package src.Modification;

import src.Recipe;

import java.util.List;

public class ModifyTagsCommand implements Command{
    private Recipe recipe;
    private List<String> oldTags;
    private List<String> newTags;

    public ModifyTagsCommand(Recipe recipe, List<String> newTags) {
        this.recipe = recipe;
        this.newTags = newTags;
        this.oldTags = recipe.getTags();
    }

    @Override
    public void execute() {
        recipe.setTags(newTags);
    }

    @Override
    public void undo() {
        recipe.setTags(oldTags);
    }

}
