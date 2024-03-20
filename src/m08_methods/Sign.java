package m08_methods;

/*
    Finish the given method `sign()` to print if the number is a positive number, negative number, or zero. The `sign()` method is already called in the main method and is also given an argument `n`.

    Examples:
        sign(5) -> positive
        sign(-30) -> negative
        sign(0) -> zero
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sign extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        sign(n);
    }

    public static void sign(int n){
        // WRITE YOUR CODE HERE
        if(n > 0){
            System.out.println("positive");
        } else if (n < 0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        //System.out.println(n > 0 ? "positive" : n < 0 ? "negative" : "zero");
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("5");
        Sign.main(null);
        assertEquals("positive", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("-30");
        Sign.main(null);
        assertEquals("negative", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("0");
        Sign.main(null);
        assertEquals("zero", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("-8");
        Sign.main(null);
        assertEquals("negative", outContent.toString().trim());
    }

    @Test
    public void test5() {
        provideInput("17");
        Sign.main(null);
        assertEquals("positive", outContent.toString().trim());
    }

}
