package src.Product;

import src.Factory.AppetizerFactory;
import src.Factory.RecipeFactory;
import src.Recipe;

import java.util.List;

public class AppetizerProduct extends Recipe {
RecipeFactory appetizerFactory ;
    public AppetizerProduct(RecipeFactory appetizerFactory) {
        super();
        this.appetizerFactory = appetizerFactory;

    }

}
