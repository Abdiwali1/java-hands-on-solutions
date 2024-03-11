package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
### Use a `switch statement` to display the day of the week when given an `int` `day`.
If an invalid `day` is given print `No such a day`.

#### The starting day will be 1, as Monday and the ending day will be 7, as Sunday.

Main topics: switch statements, primitive variables

Ex:
  day is 1:
  Output: Monday

  day is 5:
  Output: Friday

  day is 20:
  Output: No such a day
 */

public class DayOfWeek extends TestBase {
    public static void main(String[] args) {
        int day = args.length > 0 ? Integer.parseInt(args[0]) : 1;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No such a day");
        }
    }

    @Test
    public void test1() {
        DayOfWeek.main(new String[]{"1"});
        assertEquals("Monday", outContent.toString().trim());
    }

    @Test
    public void test2() {
        DayOfWeek.main(new String[]{"2"});
        assertEquals("Tuesday", outContent.toString().trim());
    }

    @Test
    public void test3() {
        DayOfWeek.main(new String[]{"3"});
        assertEquals("Wednesday", outContent.toString().trim());
    }

    @Test
    public void test4() {
        DayOfWeek.main(new String[]{"4"});
        assertEquals("Thursday", outContent.toString().trim());
    }

    @Test
    public void test5() {
        DayOfWeek.main(new String[]{"5"});
        assertEquals("Friday", outContent.toString().trim());
    }

    @Test
    public void test6() {
        DayOfWeek.main(new String[]{"6"});
        assertEquals("Saturday", outContent.toString().trim());
    }

    @Test
    public void test7() {
        DayOfWeek.main(new String[]{"7"});
        assertEquals("Sunday", outContent.toString().trim());
    }

    @Test
    public void test8() {
        DayOfWeek.main(new String[]{"8"});
        assertEquals("No such a day", outContent.toString().trim());
    }
}