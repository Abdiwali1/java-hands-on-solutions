package m10_string;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Finish the method called `wordCount()` that will take a `String` `words` argument and return an `int` for the number of words in the given `words` variable. The words are seperated by a space. The `wordCount()` method is already called in the main method with an argument.

    Examples:
      wordCount("one two three") -> 3
      wordCount("foo bar") -> 2
 */

public class WordCount extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(wordCount(str));
    }

    public static int wordCount(String words){
        // WRITE YOUR CODE HERE
        words = words.trim();
        int spaces = 0;

        for(int i = 0; i < words.length(); i++){
            if(words.charAt(i) == ' '){
                spaces++;
            }
        }

        return spaces + 1;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("one two three");
        WordCount.main(null);
        assertEquals("3", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("foo bar");
        WordCount.main(null);
        assertEquals("2", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("hello");
        WordCount.main(null);
        assertEquals("1", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("how to create a program");
        WordCount.main(null);
        assertEquals("5", outContent.toString().trim());
    }
}