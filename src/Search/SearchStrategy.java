package src.Search;

import src.RecipeProduct;

import java.util.List;

public interface SearchStrategy {
    List<RecipeProduct> search(List<RecipeProduct> recipeProducts, String keyword);
}
