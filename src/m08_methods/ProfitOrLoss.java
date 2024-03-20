package m08_methods;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Finish the method called `profit()` that will take two `int` arguments and returns a String that is `profit`, `loss`, or `no loss`. The first argument is the `buyPrice` value and the second argument is the `sellPrice` value. There is a profit if the sell price is more than the buy price.


    Examples:
        profit(100,1500)  -> profit
        profit(20, 5) -> loss
        profit(100,100) -> no loss

 */

public class ProfitOrLoss extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n2 = input.nextInt();
        System.out.println(profit(n, n2));
    }

    public static String profit(int n, int n2){
        // WRITE YOUR CODE HERE
//        String result = "";
//        if(n < n2){
//           result = "profit";
//        } else if(n > n2) { // bigger buy value
//            result = "loss";
//        } else {
//            result = "no loss";
//        }
//
//        return result;
        return n < n2 ? "profit" : n > n2 ? "loss" : "no loss";
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("100", "150");
        ProfitOrLoss.main(null);
        assertEquals("profit", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("20", "5");
        ProfitOrLoss.main(null);
        assertEquals("loss", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("100", "100");
        ProfitOrLoss.main(null);
        assertEquals("no loss", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("25", "200");
        ProfitOrLoss.main(null);
        assertEquals("profit", outContent.toString().trim());
    }

    @Test
    public void test5() {
        provideInput("300", "150");
        ProfitOrLoss.main(null);
        assertEquals("loss", outContent.toString().trim());
    }

}
