package src;

import src.Search.CategorySearchStrategy;
import src.Search.IngredientSearchStrategy;
import src.Search.TagSearchStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeClient {
public static void main(String[] args){
    String search;
    Scanner scanner = new Scanner(System.in);
    System.out.println("""
            Main Menu:
             *select the index of the option that you wanna use*\s
            1.Create Recipe
            2.Search Recipe
            3.Modify Recipe
            4.Rate Recipe""");
    int i = scanner.nextInt();
    if(i ==2){
        System.out.println("""
            Main Menu:
             *select the index of the option that you wanna use*\s
            1.Category Search
            2.Tag Search 
            3.Ingredient Search""");
        int searchType = scanner.nextInt();
        switch (searchType){
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
     static void displayRecipes(List<Recipe> recipes) {
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
