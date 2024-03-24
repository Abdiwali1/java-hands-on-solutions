package m10_string;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Finish the method called `reverse()` that will take a `String` `str` argument and returns a reversed version of `str`. Reversing the characters will change the position of the characters from the beginning and end. The `reverse()` method is already called in the main method with an argument.

    Examples:
      reverse("java") -> avaj
      reverse("Hello") -> olleH
 */

public class ReverseString extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("java");
        ReverseString.main(null);
        assertEquals("avaj", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("Hello");
        ReverseString.main(null);
        assertEquals("olleH", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("I Love Java");
        ReverseString.main(null);
        assertEquals("avaJ evoL I", outContent.toString().trim());
    }

}
