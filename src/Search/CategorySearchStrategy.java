package src.Search;

import src.RecipeProduct;

import java.util.List;

public class CategorySearchStrategy implements SearchStrategy{
    @Override
    public List<RecipeProduct> search(List<RecipeProduct> recipeProducts, String keyword) {
        return recipeProducts.stream()
                .filter(recipe -> recipe.getCategories().stream()
                        .anyMatch(category -> category.equalsIgnoreCase(keyword)))
                .collect(java.util.stream.Collectors.toList());
    }
}
