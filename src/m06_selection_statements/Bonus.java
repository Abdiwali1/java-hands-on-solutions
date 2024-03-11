package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given the integer variables goodsSold and bonus, Use an `if statement` that assigns 10,000
to the variable bonus if the value of the variable goodsSold is equal or greater than 500,000.
bonus is 0 otherwise.

Print out value of bonus
Ex:
 goodsSold is 500,000
  Output:
    bonus = 10000

 goodsSold is 300500
  Output:
    bonus = 0
 */
public class Bonus extends TestBase {
    public static void main(String[] args) {
        int goodsSold = args.length > 0 ? Integer.parseInt(args[0]) : 500_000;
        int bonus = 0;
        //WRITE YOUR CODE HERE:
        if (goodsSold >= 500_000)
            bonus = 10000;

        System.out.println("bonus = " + bonus);
    }

    @Test
    public void test1() {
        Bonus.main(new String[]{"655300"});
        assertEquals("bonus = 10000", outContent.toString().trim());
    }

    @Test
    public void test2() {
        Bonus.main(new String[]{"400"});
        assertEquals("bonus = 0", outContent.toString().trim());
    }

    @Test
    public void test3() {
        Bonus.main(new String[]{"500000"});
        assertEquals("bonus = 10000", outContent.toString().trim());
    }
}
