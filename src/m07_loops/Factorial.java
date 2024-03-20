package m07_loops;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Use a `loop` to calculate the factorial of the given number `n`. In mathematics a `factorial` number is a positive integer that is the product of all the positive integers less than or equal to the `n` number.
    It is commonly written as `n!` In other words, a factorial value is the number multiplied to the number less than it, multiplied by the number less than it, repeating until 1. See the examples for clarification.

    Ex:
      Input:
        5
      Output:
        120
      -> The calculation would be:
        5 * 4 * 3 * 2 * 1 = 120

    Ex:
      Input:
        8
      Output:
        40320
      -> The calculation would be:
        8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 40320
 */

public class Factorial extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        // WRITE YOUR CODE HERE

        int factorial = 1;
        while(n > 1){
            factorial *= n--;
        }

        System.out.println(factorial);

    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("5");
        main(null);
        assertEquals("120", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("6");
        main(null);
        assertEquals("720", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("7");
        main(null);
        assertEquals("5040", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("8");
        main(null);
        assertEquals("40320", outContent.toString().trim());
    }

    @Test
    public void test5() {
        provideInput("10");
        main(null);
        assertEquals("3628800", outContent.toString().trim());
    }

}
