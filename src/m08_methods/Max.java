package m08_methods;

/*
    Finish the method called `max()` that will take two `int` arguments and returns the number that is the biggest between them.

    Example:
        max(1, 10) -> 10
        max(20, 19) -> 20
        max(11, 5) -> 11
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Max extends TestBase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n2 = input.nextInt();
        System.out.println(max(n, n2));
    }

    public static int max(int n, int n2){
        // WRITE YOUR CODE HERE
        return n > n2 ? n : n2;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("1", "10");
        Max.main(null);
        assertEquals("10", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("20", "19");
        Max.main(null);
        assertEquals("20", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("11", "5");
        Max.main(null);
        assertEquals("11", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("-5", "3");
        Max.main(null);
        assertEquals("3", outContent.toString().trim());
    }

    @Test
    public void test5() {
        provideInput("-100", "-400");
        Max.main(null);
        assertEquals("-100", outContent.toString().trim());
    }
    @Test
    public void test6() {
        provideInput("30", "30");
        Max.main(null);
        assertEquals("30", outContent.toString().trim());
    }
}
