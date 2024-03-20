package m08_methods;

/*
    Finish the method called `waterTax()` that will take a `double` `units` argument and returns a `double` bill cost. Use the given guidelines to calculate the bill cost based on the number of used units. The more water used, the more it will cost. The method is already called in the main method with arguments.


    - If the units are under 50 (including 50):
        bill = units * 0.60

    - If the units are above 50:
        bill = units * 0.90

    - If the units are above 100:
        the bill is the same as the above 50 units, but with an additional fee of $50

    - If the units are above 150:
        the bill is the same as the above 50 units, but with an additional fee of $100

    Examples:
        waterTax(50) ->  30.0
        waterTax(55) -> 49.5
        waterTax(151) -> 235.9
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaterTax extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(waterTax(n));
    }

    public static double waterTax(int n){
        // WRITE YOUR CODE HERE
        double bill = n * 0.6;

        if(n > 50){
            bill = n * 0.9;
        }

        if(n > 150){
            bill += 100;
        } else if(n > 100){
            bill += 50;
        }

        return bill;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("50");
        WaterTax.main(null);
        assertEquals("30.0", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("55");
        WaterTax.main(null);
        assertEquals("49.5", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("151");
        WaterTax.main(null);
        assertEquals("235.9", outContent.toString().trim());
    }

}
