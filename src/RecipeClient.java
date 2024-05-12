package src;

import src.Product.AppetizerProduct;
import src.Search.CategorySearchStrategy;

import java.util.*;

import src.Factory.RecipeFactory;

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
            String search;

        }

        else if (index == 2) {
            System.out.println("""
                        Main Menu:
                         *select the index of the option that you wanna use*\s
                        1.Category Search
                        2.Tag Search 
                        3.Ingredient Search""");
            int searchType = scanner.nextInt();
            if (searchType == 1) {
                System.out.print("Enter the Categories: ");
                String search = scanner.next();
                List<Recipe> CategorySearchStrategy = new CategorySearchStrategy().search(new ArrayList<>(), search);
                System.out.println(CategorySearchStrategy);
            }
        }
    }
}
