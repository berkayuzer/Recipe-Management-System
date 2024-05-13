package src;

import java.util.ArrayList;
import java.util.List;

public class RecipeRepository {
    private List<RecipeProduct> recipeProducts;
    public static String[] tags = {"Vegetarian","Gluten-free","Spicy"};
    public static String[] appetizerCategories = {"Cocktail","Canepe","Chips and Dip", "Fruit"};
    public static String[] mainDishCategories = {"Meat","Chicken","Pork","Seafood","Vegetarian", "Pasta"};
    public static String[] dessertCategories = {"Cake","Pie","Cookies","Ice Cream","Candy"};
    public RecipeRepository() {
        this.recipeProducts = new ArrayList<>();
    }

    // Add a recipe to the repository
    public void saveRecipe(RecipeProduct recipeProduct) {
        recipeProducts.add(recipeProduct);
    }

    // Get all recipes in the repository
    public List<RecipeProduct> getAllRecipes() {
        return new ArrayList<>(recipeProducts); // Return a copy to prevent modification of the internal list
    }
}
