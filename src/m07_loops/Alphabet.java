package m07_loops;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Use a `loop` to print the alphabet from `A` to `Z`. Print all the characters in one line, with no spaces between them.

    Also use another `loop` to print the alphabet from `z` to `a`. Print all the character in one line, with no spaces between them.

    Note: There will be two lines in the output. One of the uppercase letters from `A` to `Z`, and a second line for the lowercase letter from `z` to `a`.

    Note: Do not just print the characters as a String, use a loop to iterate through all the characters

    Example Flow:

    ABCDEFGHIJKLMNOPQRSTUVWXYZ
    zyxwvutsrqponmlkjihgfedcba
 */
public class Alphabet extends TestBase {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE

        for(char letter = 'A'; letter <= 'Z'; letter++){
            System.out.print(letter);
        }

        System.out.println();

        for(char letter = 'z'; letter >= 'a'; letter--){
            System.out.print(letter);
        }

    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        main(null);
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ\nzyxwvutsrqponmlkjihgfedcba", outContent.toString().trim());
    }
}
