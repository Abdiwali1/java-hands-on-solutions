package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given the integer variables a and b, Use an `if statement` to determine if the given number `a` is greater
than the other given number `b`.
Print out which is the biggest in the following format:

$number is greater

#### Note: The two given numbers will not be equal

Ex:
 a is 1 , b is 2
  Output:
    2 is greater

  a is 7 , b is 4
  Output:
    7 is greater
 */
public class GreaterNumber extends TestBase {
    public static void main(String[] args) {
        int a = args.length > 0 ? Integer.parseInt(args[0]) : 1;
        int b = args.length > 0 ? Integer.parseInt(args[1]) : 2;

        //WRITE YOUR CODE HERE:
        if (a > b) {
            System.out.println(a +" is greater");
        } else {
            System.out.println(b +" is greater");
        }
        //String result = a > b ? a + " is greater" : b + " is greater";
        //System.out.println(result);
    }

    @Test
    public void test1() {
        GreaterNumber.main(new String[]{"5", "15"});
        assertEquals("15 is greater", outContent.toString().trim());
    }

    @Test
    public void test2() {
        GreaterNumber.main(new String[]{"7", "5"});
        assertEquals("7 is greater", outContent.toString().trim());
    }

    @Test
    public void test3() {
        GreaterNumber.main(new String[]{"1", "10"});
        assertEquals("10 is greater", outContent.toString().trim());
    }

    @Test
    public void test4() {
        GreaterNumber.main(new String[]{"-7", "0"});
        assertEquals("0 is greater", outContent.toString().trim());
    }

}
