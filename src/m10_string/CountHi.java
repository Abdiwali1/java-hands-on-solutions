package m10_string;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Use a `loop` to count how many times the characters `hi` are found in the given String `str`. Only consider the lowercase characters for `hi`.

    Ex:
      Input:
        abc hi how
      Output:
        1

    Ex:
      Input:
        hihi bye
      Output:
        2

    Ex:
      Input:
        apple
      Output:
        0
*/


public class CountHi extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        // WRITE YOUR CODE HERE

        int count = 0; // 3
        while(str.contains("hi")){ //abc  how  hello  cat
            count++;
            str = str.replaceFirst("hi", ""); // removes the first hi
        }

        System.out.println(count);

    }


    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("abc hi how");
        CountHi.main(null);
        assertEquals("1", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("hihi bye");
        CountHi.main(null);
        assertEquals("2", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("apple");
        CountHi.main(null);
        assertEquals("0", outContent.toString().trim());
    }
}
