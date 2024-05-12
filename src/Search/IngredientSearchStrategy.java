package src.Search;

import src.Recipe;

import java.util.List;

public class IngredientSearchStrategy implements SearchStrategy{
    @Override
    public List<Recipe> search(List<Recipe> recipes, String keyword) {
        return recipes.stream()
                .filter(recipe -> recipe.getIngredients().stream()
                        .anyMatch(ingredient -> ingredient.equalsIgnoreCase(keyword)))
                .collect(java.util.stream.Collectors.toList());
    }
}
