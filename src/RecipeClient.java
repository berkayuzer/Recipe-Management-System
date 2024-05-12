package src;

import java.util.Scanner;
import java.util.SortedMap;

public class RecipeClient {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Main Menu:\n *select the index of the option that you wanna use* \n"+"1.Create Recipe\n"+"2.Search Recipe\n"+"3.Modify Recipe\n"+"4.Rate Recipe");
    int index = scanner.nextInt();
    if (index == 1){
        System.out.println("Create Recipe Menu");
        System.out.println("Enter the recipe name:");
        String recipeName = scanner.nextLine();
        System.out.println("");
        }
    }
}
