package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
   Pizza Order Program

You're making a program to calculate the cost of a pizza order.
You're given three pieces of information: the pizza size (size),
whether extra pepperoni should be added (addPepperoni), and whether extra cheese should be added
(extraCheese). Your goal is to calculate the total price of the pizza order.

Menu Prices

    Small pizza (S): $13.99
    Medium pizza (M): $15.99
    Large pizza (L): $18.79
Additional Costs

If addPepperoni is 'Y':
    Small pizza: +$1.50
    Medium pizza: +$1.90
    Large pizza: +$2.10
If extraCheese is 'Y':
    Small pizza: +$1.25
    Medium pizza: +$1.65
    Large pizza: +$2.00
Calculate Total Price
The total price will be the sum of the pizza size price and any additional costs for extra toppings.

Examples:

Example 1:
    Size: Large (L)
    Add Pepperoni: Yes (Y)
    Extra Cheese: Yes (Y)
    Total Price: $22.89
Example 2:
    Size: Small (S)
    Add Pepperoni: No (N)
    Extra Cheese: Yes (Y)
    Total Price: $15.24
Example 3:
    Size: Medium (M)
    Add Pepperoni: No (N)
    Extra Cheese: No (N)
    Total Price: $15.99
Your program should calculate the total price according to these rules and print the total price.
 */

public class PizzaOrder extends TestBase {
    public static void main(String[] args) {
        char size = args.length > 0 ? args[0].charAt(0) : 'S';
        char addPepperoni = args.length > 0 ? args[1].charAt(0) : 'Y';
        char extraCheese = args.length > 0 ? args[2].charAt(0) : 'Y';
        double price = 0;

        //WRITE YOUR CODE HERE:
        if (size == 'S') {
            price = 13.99;
        } else if (size == 'M') {
            price = 15.99;
        } else if (size == 'L') {
            price = 18.79;
        }

        if (addPepperoni == 'Y') {
            if (size == 'S') {
                price += 1.50;
            } else if (size == 'M') {
                price += 1.90;
            } else if (size == 'L') {
                price += 2.10;
            }
        }

        if (extraCheese == 'Y') {
            if (size == 'S') {
                price += 1.25;
            } else if (size == 'M') {
                price += 1.65;
            } else if (size == 'L') {
                price += 2.0;
            }
        }

        System.out.println("total price = $" + price );
    }

    @Test
    public void test1() {
        PizzaOrder.main(new String[]{"S","N","N"});
        assertEquals("total price = $13.99", outContent.toString().trim());
    }

    @Test
    public void test2() {
        PizzaOrder.main(new String[]{"M","N","N"});
        assertEquals("total price = $15.99", outContent.toString().trim());
    }

    @Test
    public void test3() {
        PizzaOrder.main(new String[]{"L","N","N"});
        assertEquals("total price = $18.79", outContent.toString().trim());
    }

    @Test
    public void test4() {
        PizzaOrder.main(new String[]{"S","Y","Y"});
        assertEquals("total price = $16.740000000000002", outContent.toString().trim());
    }

    @Test
    public void test5() {
        PizzaOrder.main(new String[]{"M","Y","N"});
        assertEquals("total price = $17.89", outContent.toString().trim());
    }

    @Test
    public void test6() {
        PizzaOrder.main(new String[]{"L","N","Y"});
        assertEquals("total price = $20.79", outContent.toString().trim());
    }

}
