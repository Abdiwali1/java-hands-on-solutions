package m10_string;

/*
    Use a `loop` to print each vowel (a, e, i, o, u) from the given `word`

    Ex:
      Input:
        howdyho
      Output:
        oo

    Ex:
      Input:
        java
      Output:
        aa

    Ex:
      Input:
        apple
      Output:
        ae
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vowels extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        // WRITE YOUR CODE HERE

        String vowels = "aeiou"; // apple
        for(int i = 0; i < word.length(); i++){
            String eachChar = word.substring(i, i+1);
            if(vowels.contains(eachChar)){
                System.out.print(eachChar);
            }
        }

    }

    //if(vowels.contains("" + word.charAt(i))){  -> instead of line 39 we can use this


    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("howdyho");
        Vowels.main(null);
        assertEquals("oo", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("java");
        Vowels.main(null);
        assertEquals("aa", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("apple");
        Vowels.main(null);
        assertEquals("ae", outContent.toString().trim());
    }

}
