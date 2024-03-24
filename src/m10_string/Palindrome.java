package m10_string;

/*
    Finish the method called `isPalindrome()` that will take a `String` argument and return `boolean`.
    If the String is palindrome the method returns `true`, but if the String is not palindrome the method returns `false`.

    A palindrome is when the characters are the same read forwards or backwards

    Finish the overloaded method called `isPalindrome()` that has an 'int' argument. Return if the given number is palindrome. Challenge: do not use String in any way in this version
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Palindrome extends TestBase {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1:
                System.out.println(isPalindrome(input.next()));
                break;
            case 2:
                System.out.println(isPalindrome(input.nextInt()));
        }
    }

    public static boolean isPalindrome(String str) {
        // WRITE YOUR CODE HERE
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
               return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        // WRITE YOUR CODE HERE

        int original = num;
        int reversed = 0;

        while(num > 0){
            int digit = num % 10;
            num /= 10;
            reversed = reversed * 10 + digit;
        }

        return original == reversed;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("1", "racecar");
        Palindrome.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("1", "anna");
        Palindrome.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("1", "java");
        Palindrome.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("1", "moon");
        Palindrome.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test5() {
        provideInput("1", "abcdcba");
        Palindrome.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test6() {
        provideInput("1", "abcdecba");
        Palindrome.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test7() {
        provideInput("2", "1002");
        Palindrome.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test8() {
        provideInput("2", "1001");
        Palindrome.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test9() {
        provideInput("2", "1234");
        Palindrome.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test10() {
        provideInput("2", "12621");
        Palindrome.main(null);
        assertEquals("true", outContent.toString().trim());
    }


    @Test
    public void test11() {
        provideInput("2", "987591");
        Palindrome.main(null);
        assertEquals("false", outContent.toString().trim());
    }


    @Test
    public void test12() {
        provideInput("2", "23188132");
        Palindrome.main(null);
        assertEquals("true", outContent.toString().trim());
    }

}
