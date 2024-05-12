package src.Search;

import src.Recipe;

import java.util.List;
import java.util.stream.Collectors;

public class TagSearchStrategy implements SearchStrategy{
    @Override
    public List<Recipe> search(List<Recipe> recipes, String keyword) {
        return recipes.stream()
                .filter(recipe -> recipe.getTags().stream()
                        .anyMatch(tag -> tag.equalsIgnoreCase(keyword)))
                .collect(Collectors.toList());
    }
}
