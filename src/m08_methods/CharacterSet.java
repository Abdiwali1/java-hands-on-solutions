package m08_methods;

/*
	Finish the 'getCharacterSet()' method  with two 'char' arguments to return a String will all the characters within a given range of characters. The range will be based on the ASCII table. The argument will be the 'start' and 'end' characters of the range

    Ex:
        getCharacterSet('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        getCharacterSet('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}

    Also finish the overloaded 'getCharacterSet()' method with the String argument 'group'. Use the following data for possible groups:
        uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
        lowercase -> abcdefghijklmnopqrstuvwxyz
        digit -> 123456789
        special -> !"#$%&'()*+,-.

 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterSet extends TestBase {

    // DO NOT CHANGE
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()){
            case 1:
                System.out.println(getCharacterSet(input.next().charAt(0), input.next().charAt(0)));
                break;
            case 2:
                System.out.println(getCharacterSet(input.next()));
        }
    }

    public static String getCharacterSet(char start, char end){
        // WRITE YOUR CODE HERE
        String result = "";
        for(char eachChar = start; eachChar <= end; eachChar++){
            result += eachChar;
        }

        return result;
    }

    public static String getCharacterSet(String group){
        // WRITE YOUR CODE HERE
        char start = 0;
        char end = 0;
        switch (group){
            case "uppercase":
                start = 'A';
                end = 'Z';
                break;
            case "lowercase":
                start = 'a';
                end = 'z';
                break;
            case "digit":
                start = '1';
                end = '9';
                break;
            case "special":
                start = '!';
                end = '.';
        }
        return getCharacterSet(start, end);
    }


    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("1", "7", "P");
        CharacterSet.main(null);
        assertEquals("789:;<=>?@ABCDEFGHIJKLMNOP", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("1", "X", "}");
        CharacterSet.main(null);
        assertEquals("XYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("2", "uppercase");
        CharacterSet.main(null);
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("2", "lowercase");
        CharacterSet.main(null);
        assertEquals("abcdefghijklmnopqrstuvwxyz", outContent.toString().trim());
    }

    @Test
    public void test5() {
        provideInput("2", "digit");
        CharacterSet.main(null);
        assertEquals("123456789", outContent.toString().trim());
    }

    @Test
    public void test6() {
        provideInput("2", "special");
        CharacterSet.main(null);
        assertEquals("!\"#$%&'()*+,-.", outContent.toString().trim());
    }

    @Test
    public void test7() {
        provideInput("1", "+", "g");
        CharacterSet.main(null);
        assertEquals("+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefg", outContent.toString().trim());
    }

}


