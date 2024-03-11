package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Given integer variable number,
	For a number that is a divisible by both 3 and 5, print "FINRA" instead of the number.
	For a number that is a divisible by 3, print "FIN" instead of the number.
	For a number that is a divisible by 5, print "RA" instead of the number.
    Otherwise, print out the number
	Example:
        number is 15 => "FINRA" is printed
        number is 10 => "RA" is printed
        number is 9 => "FIN" is printed
        number is 11 => "11" is printed
 */
public class Finra extends TestBase {

    public static void main(String[] args) {

        int number = args.length > 0 ? Integer.parseInt(args[0]) : 93;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FINRA");
        } else if (number % 5 == 0) {
            System.out.println("RA");
        } else if (number % 3 == 0) {
            System.out.println("FIN");
        } else {
            System.out.println(number);
        }
    }

    @Test
    public void test1() {
        Finra.main(new String[]{"15"});
        assertEquals("FINRA", outContent.toString().trim());
    }

    @Test
    public void test2() {
        Finra.main(new String[]{"10"});
        assertEquals("RA", outContent.toString().trim());
    }

    @Test
    public void test3() {
        Finra.main(new String[]{"9"});
        assertEquals("FIN", outContent.toString().trim());
    }

    @Test
    public void test4() {
        Finra.main(new String[]{"11"});
        assertEquals("11", outContent.toString().trim());
    }

    @Test
    public void test5() {
        Finra.main(new String[]{"35"});
        assertEquals("RA", outContent.toString().trim());
    }

    @Test
    public void test6() {
        Finra.main(new String[]{"93"});
        assertEquals("FIN", outContent.toString().trim());
    }

}
