package src;

import src.Factory.AppetizerFactory;
import src.Factory.DessertFactory;
import src.Factory.MainDishFactory;
import src.Factory.RecipeFactory;
import src.Product.AppetizerProduct;
import src.Rating.RecipeRatingManager;
import src.Search.CategorySearchStrategy;
import java.util.*;
import src.Search.IngredientSearchStrategy;
import src.Search.TagSearchStrategy;
import java.util.ArrayList;

public class RecipeClient {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main Menu:\n *select the index of the option that you wanna use* \n"
                + "1.Create Recipe\n" + "2.Search Recipe\n" + "3.Modify Recipe\n" + "4.Rate Recipe");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline after nextInt()
        switch (index){
            case 1: createRecipe(); break;
            case 2: searchRecipe(); break;
            case 3: modifyRecipe(); break;
            case 4: rateRecipe(); break;
        }
    }
    static void createRecipe(){
        System.out.println("Create Recipe Menu");
        System.out.println("Which type of recipe do you want to add:\n" + "1.Appetizer\n" + "2.Main Dish\n" + "3.Dessert");
        int type = scanner.nextInt();
        System.out.println("Enter the recipe name:");
        String recipeName = scanner.next();

        // Initialize an ArrayList to store ingredients
        ArrayList<String> ingredients = new ArrayList<>();

        // Prompt user to enter ingredients
        System.out.println("Enter the ingredients (enter 'done' when finished):");
        while (true) {
            String ingredient = scanner.nextLine();
            if (ingredient.equalsIgnoreCase("done")) {
                break;
            }
            if (!ingredient.isEmpty())
                ingredients.add(ingredient);
        }
        // Prompt user to enter cooking instructions
        System.out.println("Enter the cooking instructions:");
        String cookingInstructions = scanner.nextLine();

        System.out.println("Enter the serving size:");
        int servingSize = scanner.nextInt();

        // Display the entered recipe details
        System.out.println("Recipe Name: " + recipeName);
        System.out.println("Serving Size: " + servingSize);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
        System.out.println("Cooking Instructions:");
        System.out.println(cookingInstructions);
        String[] categoryList= null;
        switch (type){
            case 1: categoryList = RecipeRepository.appetizerCategories;
                break;
            case 2: categoryList = RecipeRepository.mainDishCategories; break;
            case 3: categoryList = RecipeRepository.dessertCategories; break;
        }
        System.out.println("Choose from category you want to add (enter 'done' when finished):" + Arrays.toString(categoryList));

        ArrayList<String> selectedCategories = new ArrayList<>();
        while (selectedCategories.size() < 3) {
            String category = scanner.next();
            if (category.equalsIgnoreCase("done")) {
                break;
            }
            boolean categoryFound = false;
            for (String element : categoryList) {
                if (element.equals(category)) {
                    selectedCategories.add(category);
                    categoryFound = true;
                    break;
                }
            }
            if (!categoryFound){
                System.out.println("Warning: Category '" + category + "' not found in the array. Please enter another category:");
            }
        }
        System.out.println("The categories you chose: "+ selectedCategories);

        System.out.println("Choose from tags you want to add (enter 'done' when finished):" + Arrays.toString(RecipeRepository.tags));
        ArrayList<String> selectedTags = new ArrayList<>();
        while (selectedTags.size() < 3) {
            String tag = scanner.next();
            if (tag.equalsIgnoreCase("done")) {
                break;
            }
            boolean tagFound = false;
            for (String element : RecipeRepository.tags) {
                if (element.equals(tag)) {
                    selectedTags.add(tag);
                    tagFound = true;
                    break;
                }
            }
            if (!tagFound){
                System.out.println("Warning: Tag '" + tag + "' not found in the array. Please enter another tag:");
            }
        }
        System.out.println("The tags you chose: "+ selectedTags);
        float rating =0;
        System.out.println("Do you want to save this recipe: (Yes or No)");
        String save = scanner.next();
        if (Objects.equals(save, "Yes")) {
            if (type == 1) {

                RecipeFactory appetizerFactory = new AppetizerFactory();
                Recipe recipe = new AppetizerProduct(appetizerFactory);
                AppetizerFactory factory = new AppetizerFactory();
                Recipe appetizer = factory.createRecipe(recipeName ,ingredients, cookingInstructions, servingSize,selectedCategories, selectedTags,rating);
                RecipeRepository repository = new RecipeRepository();
                repository.saveRecipe(appetizer);
                System.out.println("Recipe saved successfully.");
            } else if (type == 2) {
                MainDishFactory factory = new MainDishFactory();
                Recipe mainDish = factory.createRecipe(recipeName ,ingredients, cookingInstructions, servingSize, selectedCategories, selectedTags, rating);
                RecipeRepository repository = new RecipeRepository();
                repository.saveRecipe(mainDish);
                System.out.println("Recipe saved successfully.");
            } else if (type == 3) {
                DessertFactory factory = new DessertFactory();
                Recipe dessert = factory.createRecipe(recipeName, ingredients, cookingInstructions, servingSize, selectedCategories, selectedTags, 1.0f);
                RecipeRepository repository = new RecipeRepository();
                repository.saveRecipe(dessert);
                System.out.println("Recipe saved successfully.");
            }
        }
    }
    static void searchRecipe(){
        String search;
        System.out.println("""
                    Main Menu:
                     *select the index of the option that you wanna use*\s
                    1.Category Search
                    2.Tag Search 
                    3.Ingredient Search""");
        int searchType = scanner.nextInt();
        switch (searchType) {
            case 1:
                System.out.print("Enter the Categories: ");
                search = scanner.nextLine();
                List<Recipe> categorySearchStrategy = new CategorySearchStrategy().search(new RecipeRepository().getAllRecipes(), search);
                displayRecipes(categorySearchStrategy);
                break;
            case 2:
                System.out.print("Enter the Tag: ");
                search = scanner.nextLine();
                List<Recipe> tagSearchStratregy = new TagSearchStrategy().search(new RecipeRepository().getAllRecipes(), search);
                displayRecipes(tagSearchStratregy);
                break;
            case 3:
                System.out.print("Enter the Ingredient: ");
                search = scanner.nextLine();
                List<Recipe> ingredientSearchStratregy = new IngredientSearchStrategy().search(new RecipeRepository().getAllRecipes(), search);
                displayRecipes(ingredientSearchStratregy);
        }
    }
    static void modifyRecipe(){}
    static void rateRecipe(){
        RecipeRatingManager recipeRatingManager =  RecipeRatingManager.getInstance();

    }
    static void displayRecipes (List < Recipe > recipes) {
        if (recipes.isEmpty()) System.out.println("No recipes found.");
        else {
            System.out.println("Search Results:");
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        }
    }
}
