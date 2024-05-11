package src.Search;

import src.Recipe;

import java.util.List;

public class CategorySearchStrategy implements SearchStrategy{
    @Override
    public List<Recipe> search(List<Recipe> recipes, String keyword) {
        return recipes.stream()
                .filter(recipe -> recipe.getCategories().stream()
                        .anyMatch(category -> category.equalsIgnoreCase(keyword)))
                .collect(java.util.stream.Collectors.toList());
    }
}
