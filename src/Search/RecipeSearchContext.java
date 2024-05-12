package src.Search;

import src.Recipe;

import java.util.List;

// Context class that uses a search strategy
public class RecipeSearchContext {
    private SearchStrategy strategy;

    public void setStrategy(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSearch(List<Recipe> recipes, String keyword) {
        strategy.search(recipes, keyword);
    }
}