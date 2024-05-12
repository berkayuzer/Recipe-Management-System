package src.Search;

import src.Recipe;

import java.util.List;
import java.util.stream.Collectors;

// Concrete strategy for searching by tags
public class TagSearchStrategy implements SearchStrategy {
    @Override
    public List<Recipe> search(List<Recipe> recipes, String keyword) {
        // Perform search by filtering recipes based on matching tags
        List<Recipe> matchingRecipes = recipes.stream()
                .filter(recipe -> recipe.getTags().contains(keyword))
                .collect(Collectors.toList());

        // Display search results
        System.out.println("Searching recipes by tags: " + keyword);
        for (Recipe recipe : matchingRecipes) {
            System.out.println(recipe); // Assuming Recipe class has a suitable toString() method
        }

        // Return the list of matching recipes
        return matchingRecipes;
    }
}
