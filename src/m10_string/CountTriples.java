package m10_string;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Finish the method called 'countTriples()' that has a String argument 'str'. Return the number of triples found in the given String. A triple is when the same character appears three times in a row. So if there is a specific character that is repeated three times, that will be counted as one triple. The triples may overlap.

    Examples:
        countTriples(abcXXXabc) -> 1
        countTriples(xxxabyyyycd) -> 3
        countTriples(xxxabyyyycd) -> 0
*/

public class CountTriples extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(countTriples(str));
    }

    public static int countTriples(String str){
        // WRITE YOUR CODE HERE

        int count = 0;
        for(int i = 0; i < str.length() - 2; i++){
            if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)){
                count++;
            }
        }

        return count;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("abcXXXabc");
        CountTriples.main(null);
        assertEquals("1", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("xxxabyyyycd");
        CountTriples.main(null);
        assertEquals("3", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("java");
        CountTriples.main(null);
        assertEquals("0", outContent.toString().trim());
    }

}
