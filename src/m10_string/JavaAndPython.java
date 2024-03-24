package m10_string;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Finish the method called 'sameCount()' that has a String argument 'str'. Return a boolean based on if the number of 'java' is found the same number of times as 'python'. Look through the given String for the given character sequences

    Case sensitivity should be ignored

    Examples:
        sameCount(We study java not python) -> true
        sameCount(What's the difference between java, javascript and python?) -> false
              the 'java' characters appear 2 times in the String but the 'python' characters appear only 1 time.
        sameCount(java python hello python world python) -> false
*/

public class JavaAndPython extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(sameCount(str));
    }

    public static boolean sameCount(String str) { // We study java not python
        // WRITE YOUR CODE HERE
        int java = 0;
        int python = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {

            if (i < length - 3 && str.substring(i, i + 4).equalsIgnoreCase("java")) {
                java++;
            }

            if (i < length - 5) {
                if (str.substring(i, i + 6).equalsIgnoreCase("python")) {
                    python++;
                }
            }
        }

        return java == python;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("We study java not python");
        JavaAndPython.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("What's the difference between java, javascript and python?");
        JavaAndPython.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. Python, on the other hand, is a general-purpose, high-level programming language that emphasizes readability and ease of use, known for its versatility and extensive standard libraries");
        JavaAndPython.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("java java java");
        JavaAndPython.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test5() {
        provideInput("java python hello python world python");
        JavaAndPython.main(null);
        assertEquals("false", outContent.toString().trim());
    }
}
