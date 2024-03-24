package m10_string;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Finish the method called `coverMe()` that will take two `String` arguments `main` and `coverMe` and returns a `String`. Find each occurrence of the String `coverMe` in `main`. Wrap each occurrence of `coverMe` in square brackets. In the case that `main` does not have any occurrence of `coverMe` return a String with the whole `main` String wrapped in square brackets
    The `coverString()` method is already called in the main method with an argument.

    Example:
        coverMe("java methods", "me")) ->  java [me]thods
        coverMe("Certified Wooden Spoon", "o")) -> Certified W[o][o]den Sp[o][o]n
        coverMe("hello hello", "ello")) ->  h[ello] h[ello]
        coverMe("apples", "pears")) ->  [apples]
 */

public class CoverMe extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String main = input.nextLine();
        String cover = input.nextLine();
        System.out.println(coverMe(main, cover));
    }

    public static String coverMe(String main, String coverMe){
        // WRITE YOUR CODE HERE
        return main.contains(coverMe) ? main.replace(coverMe, "[" + coverMe + "]") : "[" + main + "]";
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("java methods", "me");
        CoverMe.main(null);
        assertEquals("java [me]thods", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("Certified Wooden Spoon", "o");
        CoverMe.main(null);
        assertEquals("Certified W[o][o]den Sp[o][o]n", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("hello hello", "ello");
        CoverMe.main(null);
        assertEquals("h[ello] h[ello]", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("apples", "pears");
        CoverMe.main(null);
        assertEquals("[apples]", outContent.toString().trim());
    }

}
