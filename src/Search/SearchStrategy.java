package src.Search;

import src.Recipe;

import java.util.List;

// Interface for all search strategies
public interface SearchStrategy {
    List<Recipe> search(List<Recipe> recipes, String keyword);
}

// Client code to perform recipe searches
