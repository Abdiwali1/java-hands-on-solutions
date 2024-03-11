package m05_relational_logical_operators;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Given the char variable c write an expression whose value is true if and only if c is a lower-case or upper-case letter.
    assigns true or false to isLetter boolean variable

    c is 'a'
    isLetter = true

    c is 'P'
    isLetter = true

    c is '4'
    isLetter = false

    c is '$'
    isLetter = false

 */

public class IsLetter extends TestBase {
    public static void main(String[] args) {
        //Do not change below lines
        char c;
        if (args.length > 0) {
            c = args[0].charAt(0);
        } else {
            c = 'a';
        }
        //Write your code here
        boolean isLetter = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
        System.out.println("isLetter = " + isLetter);
    }
    //Do not change below tests
    @Test
    public void test1() {
        IsLetter.main(new String[]{"b"});
        assertEquals("isLetter = true", outContent.toString().trim());
    }

    @Test
    public void test2() {
        IsLetter.main(new String[]{"q"});
        assertEquals("isLetter = true", outContent.toString().trim());
    }

    @Test
    public void test3() {
        IsLetter.main(new String[]{"T"});
        assertEquals("isLetter = true", outContent.toString().trim());
    }

    @Test
    public void test4() {
        IsLetter.main(new String[]{"M"});
        assertEquals("isLetter = true", outContent.toString().trim());
    }

    @Test
    public void test5() {
        IsLetter.main(new String[]{"$"});
        assertEquals("isLetter = false", outContent.toString().trim());
    }

    @Test
    public void test6() {
        IsLetter.main(new String[]{"9"});
        assertEquals("isLetter = false", outContent.toString().trim());
    }
}
