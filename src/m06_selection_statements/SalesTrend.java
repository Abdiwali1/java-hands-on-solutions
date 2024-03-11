package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given the integer variables soldYesterday and soldToday, Write an if/else statement that compares the value of the
variables soldYesterday and soldToday, and based upon that comparison assigns salesTrend the value -1 or 1.

1 represents the case where soldToday is equal or greater than soldYesterday.
-1 represents the case where soldToday is less than soldYesterday.

Ex:
 soldYesterday is 92, soldToday is 105
  Output:
    salesTrend = 1

 soldYesterday is 44, soldToday is 12
  Output:
    salesTrend = -1
 */
public class SalesTrend extends TestBase {
    public static void main(String[] args) {
        int soldYesterday = args.length > 0 ? Integer.parseInt(args[0]) : 100;
        int soldToday = args.length > 0 ? Integer.parseInt(args[1]) : 7;
        int salesTrend;
        //WRITE YOUR CODE HERE:
        if (soldToday >= soldYesterday){
            salesTrend = 1;
        }else{
            salesTrend = -1;
        }
       // salesTrend = (soldToday >= soldYesterday) ? 1 : -1;

        System.out.println("salesTrend = " + salesTrend);
    }

    @Test
    public void test1() {
        SalesTrend.main(new String[]{"50", "123"});
        assertEquals("salesTrend = 1", outContent.toString().trim());
    }

    @Test
    public void test2() {
        SalesTrend.main(new String[]{"10", "10"});
        assertEquals("salesTrend = 1", outContent.toString().trim());
    }

    @Test
    public void test3() {
        SalesTrend.main(new String[]{"50", "33"});
        assertEquals("salesTrend = -1", outContent.toString().trim());
    }

    @Test
    public void test4() {
        SalesTrend.main(new String[]{"144", "21"});
        assertEquals("salesTrend = -1", outContent.toString().trim());
    }

}
