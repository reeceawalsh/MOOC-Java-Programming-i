import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {

    private ArrayList<String> ingredients;
    private ArrayList<Recipe> listOfRecipes;

    public RecipeManager() {
        this.listOfRecipes = new ArrayList<>();
    }

    public void readRecipe(String fileName) {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String recipeName = scanner.nextLine();
                int cookingTime = Integer.valueOf(scanner.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                this.listOfRecipes.add(recipe);
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
            }
        }   catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void listRecipes() {
        System.out.println("Recipes:");
        for (int i = 0; i < listOfRecipes.size(); i++) {
            System.out.println(listOfRecipes.get(i).toString());
        }
        System.out.println("");
    }

    public void findByName(String name) {
        System.out.println("Recipes:");
        for (int i = 0; i < listOfRecipes.size(); i++) {
            if (listOfRecipes.get(i).getName().contains(name)) {
                System.out.println(listOfRecipes.get(i).toString());
            }
        }
        System.out.println();
    }

    public void findByCookingTime(int duration) {
        System.out.println("Recipes:");
        for (int i = 0; i < listOfRecipes.size(); i++) {
            if (listOfRecipes.get(i).getDuration() <= duration) {
                System.out.println(listOfRecipes.get(i).toString());
            }
        }
        System.out.println("");
    }

    public void findByIngredient(String ingredient) {
        System.out.println("");
        System.out.println("Recipes:");
        for (int i = 0; i < listOfRecipes.size(); i++) {
                if (listOfRecipes.get(i).getIngredients().contains(ingredient)){
                    System.out.println(listOfRecipes.get(i));
                }
        }
        System.out.println("");
    }
}

