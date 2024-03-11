package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given integer variables first, second, third, write code to find out middle number
and assign to middle integer variable
Ex:
first is 5, second is 10, third is 7
Output:
    middle number = 7

first is 12, second is 10, third is 44
Output:
    middle number = 12
 */

public class MiddleNumber extends TestBase {
    public static void main(String[] args) {
        int first = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        int second = args.length > 0 ? Integer.parseInt(args[1]) : 30;
        int third = args.length > 0 ? Integer.parseInt(args[2]) : 50;

        int middle;

        if ((first > second && first < third) || (first < second && first > third)) {
            middle = first;
        } else if ((second > first && second < third) || (second < first && second > third)) {
            middle = second;
        } else {
            middle = third;
        }
        System.out.println("middle number = "+ middle);
    }

    @Test
    public void test1() {
        MiddleNumber.main(new String[]{"5", "15", "25"});
        assertEquals("middle number = 15", outContent.toString().trim());
    }

    @Test
    public void test2() {
        MiddleNumber.main(new String[]{"43", "3", "98"});
        assertEquals("middle number = 43", outContent.toString().trim());
    }

    @Test
    public void test3() {
        MiddleNumber.main(new String[]{"77", "15", "25"});
        assertEquals("middle number = 25", outContent.toString().trim());
    }
}
