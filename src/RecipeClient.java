package src;

import src.Search.CategorySearchStrategy;

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
        if(searchType == 1){
            System.out.print("Enter the Categories: ");
            search = scanner.next();
            List<Recipe> CategorySearchStrategy = new CategorySearchStrategy().search(new ArrayList<>(), search);
            System.out.println(CategorySearchStrategy);
        }
    }
    }
}
