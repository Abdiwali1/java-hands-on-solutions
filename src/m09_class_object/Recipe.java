package m09_class_object;

/*
    Given a class called Recipe
    declare these instance variables:
        name, ingredients, serving size, cost

    create a method called costPerPerson that will return a double. Calculate the amount each person would need to pay to make this recipe - use the serving size and cost values

    create a toString() that shows the information in the following format:
        Recipe for $name will require these ingredients:
                $all_ingredients
        This dish will serve $serving_size and cost a total of $ $cost to make

    After finishing the Recipe class uncomment the TestRecipe class
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Recipe {
    String name;
    String ingredients;
    int servingSize;
    double cost;

    public double costPerPerson(){
        return cost / servingSize;
    }

    public String toString(){
        return "Recipe for " + name + " will require these ingredients:\n\t" + ingredients + "\nThis dish will serve " + servingSize + " people and cost a total of $ " + cost;
    }

}


class TestRecipe extends TestBase {
    public static void main(String[] args) {
        // create Recipe objects to test your code


    }

    @Test
    public void test1() {
        Recipe recipe = new Recipe();
        recipe.name = "Pizza";
        recipe.ingredients = "Dough, Cheese, Tomatoes";
        recipe.servingSize = 4;
        recipe.cost = 14.99;
        String expected = "Recipe for Pizza will require these ingredients:\n" +
                "\tDough, Cheese, Tomatoes\n" +
                "This dish will serve 4 people and cost a total of $ 14.99";
        assertEquals(expected, recipe.toString());
    }

    @Test
    public void test2() {
        Recipe recipe = new Recipe();
        recipe.name = "Grilled Cheese";
        recipe.ingredients = "Bread, Cheese, Butter";
        recipe.servingSize = 1;
        recipe.cost = 3.99;
        String expected = "Recipe for Grilled Cheese will require these ingredients:\n" +
                "\tBread, Cheese, Butter\n" +
                "This dish will serve 1 people and cost a total of $ 3.99";
        assertEquals(expected, recipe.toString());
    }

    @Test
    public void test3() {
        Recipe recipe = new Recipe();
        recipe.name = "Pizza";
        recipe.ingredients = "Dough, Cheese, Tomatoes";
        recipe.servingSize = 4;
        recipe.cost = 14.99;
        double expected = 3.7475;
        assertEquals(expected, recipe.costPerPerson());
    }

    @Test
    public void test4() {
        Recipe recipe = new Recipe();
        recipe.name = "Grilled Cheese";
        recipe.ingredients = "Bread, Cheese, Butter";
        recipe.servingSize = 2;
        recipe.cost = 3.99;
        double expected = 1.995;
        assertEquals(expected, recipe.costPerPerson());
    }
}
