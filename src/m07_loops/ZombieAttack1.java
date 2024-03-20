package m07_loops;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    There is a zombie disease pandemic wiping out populations. Use a `loop` to keep track of the city's population. The starting population is given as the `inhabitants` value. Each day the city is losing half of its population. Write the program that will show the population day by day, until the city gets to zero.

        Ex:
          Input:
            6

          Output:
            Day 0 [6]
            Day 1 [3]
            Day 2 [1]
            ---- EXTINCT ----

        Ex:
          Input:
            20

          Output:
            Day 0 [20]
            Day 1 [10]
            Day 2 [5]
            Day 3 [2]
            Day 4 [1]
            ---- EXTINCT ----
 */

public class ZombieAttack1 extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        // WRITE YOUR CODE HERE

        for(int day = 0; n > 0; day++, n /= 2){
            System.out.println("Day " + day + " [" + n + "]");
        }


    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("6");
        main(null);
        assertEquals("Day 0 [6]\n" +
                "Day 1 [3]\n" +
                "Day 2 [1]", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("20");
        main(null);
        assertEquals("Day 0 [20]\n" +
                "Day 1 [10]\n" +
                "Day 2 [5]\n" +
                "Day 3 [2]\n" +
                "Day 4 [1]", outContent.toString().trim());
    }


    @Test
    public void test3() {
        provideInput("124");
        main(null);
        assertEquals("Day 0 [124]\n" +
                "Day 1 [62]\n" +
                "Day 2 [31]\n" +
                "Day 3 [15]\n" +
                "Day 4 [7]\n" +
                "Day 5 [3]\n" +
                "Day 6 [1]", outContent.toString().trim());
    }

}
