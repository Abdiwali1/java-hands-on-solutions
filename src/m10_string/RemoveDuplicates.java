package m10_string;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Finish the method called `uniqueChars()` that will take a `String` `str` argument and returns a `String` that will only have a unique copy of each character. Remove the duplicate instances of each character. The `uniqueChars()` method is already called in the main method with an argument.

    Example:
        uniqueChars("java") -> jav
        uniqueChars("mama") -> ma
        uniqueChars("spoon") -> spon
 */

public class RemoveDuplicates extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String str) { // java
        // WRITE YOUR CODE HERE

        String unique = ""; // jav
        for(int i = 0; i < str.length(); i++){
            String eachLetter = str.substring(i, i+1); // charAt(i) -> returns a char
            if(!unique.contains(eachLetter)){
                unique += eachLetter;
            }
        }

        return unique;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("java");
        RemoveDuplicates.main(null);
        assertEquals("jav", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("mama");
        RemoveDuplicates.main(null);
        assertEquals("ma", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("spoon");
        RemoveDuplicates.main(null);
        assertEquals("spon", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("aaaaaaaabbbbbbbbccccccccc");
        RemoveDuplicates.main(null);
        assertEquals("abc", outContent.toString().trim());
    }
}
