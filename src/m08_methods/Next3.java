package m08_methods;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Finish the method called `next3()` that will take an int argument and print the three numbers that come after the given number. The `next3()` method is already called in the main method. Print in the following format:

    $number1 $number2 $number3

    The three next numbers are printed on the same line with spaces between them

    Examples:
      next3(1)
      output:
         2 3 4

      next3(10)
      output:
        11 12 13
 */

public class Next3 extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        next3(n);
    }

    public static void next3(int n){
        // WRITE YOUR CODE HERE
        System.out.println(++n + " " + ++n + " " + ++n);
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("1");
        Next3.main(null);
        assertEquals("2 3 4", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("10");
        Next3.main(null);
        assertEquals("11 12 13", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("-8");
        Next3.main(null);
        assertEquals("-7 -6 -5", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("120");
        Next3.main(null);
        assertEquals("121 122 123", outContent.toString().trim());
    }
}
