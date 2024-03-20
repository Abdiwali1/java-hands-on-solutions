package m08_methods;

/*
    There are two static methods defined. These methods are also called in the main method. Finish the methods to get the expected outcome.

    These are void methods with no parameters

    - the `hello()` method should print the text `Hello`
    - the `world()` method should print the text `World!`

    - When the methods are called in the main method they will display a final message of:
        Hello
        World!
*/

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorld extends TestBase {
    public static void main(String[] args) {
        hello();
        world();
    }

    public static void hello() {
        // WRITE YOUR CODE HERE
        System.out.println("Hello");
    }

    public static void world() {
        // WRITE YOUR CODE HERE
        System.out.println("World!");
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        HelloWorld.main(null);
        assertEquals("Hello\nWorld!", outContent.toString().trim());
    }

}
