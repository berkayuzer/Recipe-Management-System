package src.Search;

import src.RecipeProduct;

import java.util.List;
import java.util.stream.Collectors;

public class TagSearchStrategy implements SearchStrategy{
    @Override
    public List<RecipeProduct> search(List<RecipeProduct> recipeProducts, String keyword) {
        return recipeProducts.stream()
                .filter(recipe -> recipe.getTags().stream()
                        .anyMatch(tag -> tag.equalsIgnoreCase(keyword)))
                .collect(Collectors.toList());
    }
}
