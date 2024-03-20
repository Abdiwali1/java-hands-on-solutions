package m08_methods;

/*
    Finish the method called `simpleRoomBook()` that will take four arguments and returns a boolean about if the room can be booked for that given day. The method is already called in the main method with arguments. The arguments in order are:

    - `boolean` `isAvailable`
        - if the isAvailable value is true continue to check the date, but if the value is false no rooms are available so there is no need to compare with the date
    - `int` `month`
    - `int` `day`
    - `int` `year`

    The restrictions for booking a room include:

    - There is only open dates in the year 2018.
    - All rooms are booked between 7/1/2018(mm/dd/yy) - 7/8/2018(mm/dd/yy) -> both the dates are inclusive

    Examples:

      simpleRoomBook(false,2,1,2018) -> false
      simpleRoomBook(true,2,1,2018) -> true
      simpleRoomBook(true,2,1,2022) -> false
      simpleRoomBook(true,7,1,2018) -> false
 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleRoomBooking extends TestBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isAvailable = input.nextBoolean();
        int month = input.nextInt();
        int day =  input.nextInt();
        int year =  input.nextInt();
        System.out.println(simpleRoomBook(isAvailable, month, day, year));
    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        // WRITE YOUR CODE HERE

        boolean firstCheck = isAvailable && year == 2018;
        boolean secondCheck = month == 7 && day < 8;

        return firstCheck && !secondCheck;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("false", "2", "1", "2018");
        SimpleRoomBooking.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("true", "2", "1", "2018");
        SimpleRoomBooking.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("true", "2", "1", "2022");
        SimpleRoomBooking.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("true", "7", "1", "2018");
        SimpleRoomBooking.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test5() {
        provideInput("true", "5", "2", "2018");
        SimpleRoomBooking.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test6() {
        provideInput("false", "5", "2", "2018");
        SimpleRoomBooking.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test7() {
        provideInput("true", "3", "23", "2018");
        SimpleRoomBooking.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test8() {
        provideInput("true", "12", "14", "2018");
        SimpleRoomBooking.main(null);
        assertEquals("true", outContent.toString().trim());
    }

    @Test
    public void test9() {
        provideInput("true", "12", "14", "2020");
        SimpleRoomBooking.main(null);
        assertEquals("false", outContent.toString().trim());
    }

    @Test
    public void test10() {
        provideInput("false", "12", "14", "2018");
        SimpleRoomBooking.main(null);
        assertEquals("false", outContent.toString().trim());
    }

}
