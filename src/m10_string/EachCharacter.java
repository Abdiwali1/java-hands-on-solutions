package m10_string;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Finish the method called `countLetters()` that will take a `String` argument `str` and returns a `String`. Find the frequency of each character in `str` and concatenate the frequency number with the character. Return the concatenated String with all the frequencies. The `countLetters()` method is already called in the main method with an argument.

    Examples:
        countLetters("aaabbcccc") -> 3a2b4c
        countLetters("appleeess") -> 1a2p1l3e2s
 */

public class EachCharacter extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(countLetters(str));
    }

    public static String countLetters(String str){ // aaabbcccc
        // WRITE YOUR CODE HERE

        String result = "";
        for(int i = 0; i < str.length(); i++){
            int count = 0;
            char mainChar = str.charAt(i);
            if(!result.contains("" + mainChar)){ // this runs when the character has NOT been counted yet
                for (int j = i; j < str.length(); j++){
                    if(mainChar == str.charAt(j)){
                        count++;
                    }
                }
                result += "" + count + mainChar;
            }
        }

        return result;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("aaabbcccc");
        EachCharacter.main(null);
        assertEquals("3a2b4c", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("appleeess");
        EachCharacter.main(null);
        assertEquals("1a2p1l3e2s", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("mississippi");
        EachCharacter.main(null);
        assertEquals("1m4i4s2p", outContent.toString().trim());
    }
}
