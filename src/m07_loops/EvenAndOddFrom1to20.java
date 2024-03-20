package m07_loops;


import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Use a `loop` to print all the even numbers from `1` to `20`. Print each number on the same line, with spaces between each

    Use another `loop` to print all the odd numbers from `1` to `20`. Print each number on the same line, with spaces between each

    Note: In the end there will be two lines. First the line to show all the even numbers and then another line to show all the odd numbers

        Example Flow:
        2 4 6 .... 18 20
        1 3 5 .... 17 19
 */

public class EvenAndOddFrom1to20 extends TestBase {

    public static void main(String[] args) {
        // WRITE YOUR CODE HERE

        for(int i = 2; i <= 20; i += 2){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 1; i <= 20; i += 2){
            System.out.print(i + " ");
        }

    }

    // TESTS: DO NOT CHANGE
    @Test
    public void test1() {
        main(null);
        assertEquals("2 4 6 8 10 12 14 16 18 20 \n1 3 5 7 9 11 13 15 17 19 ", outContent.toString());
    }
}
