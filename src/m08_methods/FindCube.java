package m08_methods;

/*
    Finish the given method `cube()` to print the cubed value of the given `n` number. Print the result. The main method calls the cube() method.

    Hint: cube of a number is n^3 = n * n * n

    Example:
        input:
          5
        output:
          5 * 5 * 5 = 125
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindCube extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        cube(n);
    }

    public static void cube(int n){
        // WRITE YOUR CODE HERE
        int cube = n * n * n;
        System.out.println(n + " * " + n + " * " + n + " = " + cube);
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("5");
        FindCube.main(null);
        assertEquals("5 * 5 * 5 = 125", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("3");
        FindCube.main(null);
        assertEquals("3 * 3 * 3 = 27", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("9");
        FindCube.main(null);
        assertEquals("9 * 9 * 9 = 729", outContent.toString().trim());
    }
}
