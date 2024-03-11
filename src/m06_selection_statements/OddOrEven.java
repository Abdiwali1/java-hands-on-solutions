package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given the integer variables num, Use an `if statement` to determine if the given number is odd or even
Print out the result in the following format:

$number is even
$number is odd

Ex:
 num is 5
  Output:
    5 is odd

  num is 4
  Output:
    4 is even
 */
public class OddOrEven extends TestBase {
    public static void main(String[] args) {
        int num = args.length > 0 ? Integer.parseInt(args[0]) : 90;

        //WRITE YOUR CODE HERE:
        if (num % 2 == 0) {
            System.out.println(num +" is even");
        } else {
            System.out.println(num +" is odd");
        }
        //System.out.println(number % 2 == 0 ? number + " is even" : number + " is odd");
    }

    @Test
    public void test1() {
        OddOrEven.main(new String[]{"5"});
        assertEquals("5 is odd", outContent.toString().trim());
    }

    @Test
    public void test2() {
        OddOrEven.main(new String[]{"7"});
        assertEquals("7 is odd", outContent.toString().trim());
    }

    @Test
    public void test3() {
        OddOrEven.main(new String[]{"10"});
        assertEquals("10 is even", outContent.toString().trim());
    }

    @Test
    public void test4() {
        OddOrEven.main(new String[]{"100"});
        assertEquals("100 is even", outContent.toString().trim());
    }

}
