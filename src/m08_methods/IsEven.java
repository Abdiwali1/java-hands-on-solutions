package m08_methods;

/*
    Finish the method called `isEven()` that will take an `int`argument and return if the given number is even as a `boolean`. If the number is even the method returns `true`, but if the number is odd the method returns `false`. The `isEven()` method is being called in the main method and given an argument.

    Examples:
      isEven(4) -> true
      isEven(7) -> false
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsEven extends TestBase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isEven(n));
    }

    public static boolean isEven(int n){
        // WRITE YOUR CODE HERE
        return n % 2 == 0;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("7");
        IsEven.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("4");
        IsEven.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("95");
        IsEven.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("10");
        IsEven.main(null);
        assertEquals("true", outContent.toString().trim());
    }

}
