package src.Search;

import src.RecipeProduct;

import java.util.List;

public class IngredientSearchStrategy implements SearchStrategy{
    @Override
    public List<RecipeProduct> search(List<RecipeProduct> recipeProducts, String keyword) {
        return recipeProducts.stream()
                .filter(recipe -> recipe.getIngredients().stream()
                        .anyMatch(ingredient -> ingredient.equalsIgnoreCase(keyword)))
                .collect(java.util.stream.Collectors.toList());
    }
}
