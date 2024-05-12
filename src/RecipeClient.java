package src;

import src.Product.AppetizerProduct;
import src.Search.CategorySearchStrategy;

import java.util.*;

import src.Factory.RecipeFactory;
import src.Search.IngredientSearchStrategy;
import src.Search.TagSearchStrategy;

import java.util.ArrayList;

public class RecipeClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main Menu:\n *select the index of the option that you wanna use* \n"
                + "1.Create Recipe\n" + "2.Search Recipe\n" + "3.Modify Recipe\n" + "4.Rate Recipe");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline after nextInt()

        if (index == 1) {
            System.out.println("Create Recipe Menu");
            System.out.println("Which type of recipe do you want to add:\n" + "1.Appetizer\n" + "2.Main Dish\n" + "3.Dessert");
            int type = scanner.nextInt();
            System.out.println("Enter the recipe name:");
            String recipeName = scanner.nextLine();

            // Initialize an ArrayList to store ingredients
            ArrayList<String> ingredients = new ArrayList<>();

            // Prompt user to enter ingredients
            System.out.println("Enter the ingredients (enter 'done' when finished):");
            while (true) {
                String ingredient = scanner.nextLine();
                if (ingredient.equalsIgnoreCase("done")) {
                    break;
                }
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
            System.out.println("Choose from tags you want to add:" + Arrays.toString(RecipeRepository.tags));
            int tags = scanner.nextInt(); //Burada tagleri nasıl alacağınızı bulmanız lazım
            System.out.println("Do you want to save this recipe: (Yes or No)");
            String save = scanner.nextLine();
            if (Objects.equals(save, "Yes")) {
                if (type == 1) {
                    //Buradan devam edicem !!!!!!!!!! -İrem
                    // RecipeFactory appetizer = new AppetizerProduct(ingredients, cookingInstructions, servingSize, );
                }
            }
        } else if (index == 2) {
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
                    List<Recipe> categorySearchStrategy = new CategorySearchStrategy().search(new ArrayList<>(), search);
                    displayRecipes(categorySearchStrategy);
                    break;
                case 2:
                    System.out.print("Enter the Tag: ");
                    search = scanner.nextLine();
                    List<Recipe> tagSearchStratregy = new TagSearchStrategy().search(new ArrayList<>(), search);
                    displayRecipes(tagSearchStratregy);
                    break;
                case 3:
                    System.out.print("Enter the Ingredient: ");
                    search = scanner.nextLine();
                    List<Recipe> ingredientSearchStratregy = new IngredientSearchStrategy().search(new ArrayList<>(), search);
                    displayRecipes(ingredientSearchStratregy);
            }
        }
    }
    static void displayRecipes (List < Recipe > recipes) {
        if (recipes.isEmpty())
            System.out.println("No recipes found.");
        else {
            System.out.println("Search Results:");
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        }
    }
}
