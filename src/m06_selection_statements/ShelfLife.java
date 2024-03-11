package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given the integer variables outsideTemperature and shelfLife, Use an `if statement` that decreases shelfLife value by 4 when
outsideTemperature is more than 90 degrees. shelfLife does not change otherwise
Print out value of shelflife
Ex:
 outsideTemperature is 92, shelfLife is 10
  Output:
    shelfLife = 6

 outsideTemperature is 74, shelfLife is 5
  Output:
    shelfLife = 5
 */
public class ShelfLife extends TestBase {
    public static void main(String[] args) {
        int outsideTemperature = args.length > 0 ? Integer.parseInt(args[0]) : 100;
        int shelfLife = args.length > 0 ? Integer.parseInt(args[1]) : 7;
        //WRITE YOUR CODE HERE:
        if (outsideTemperature > 90)
            shelfLife -= 4;

        System.out.println("shelfLife = " + shelfLife);
    }

    @Test
    public void test1() {
        ShelfLife.main(new String[]{"50", "15"});
        assertEquals("shelfLife = 15", outContent.toString().trim());
    }

    @Test
    public void test2() {
        ShelfLife.main(new String[]{"93", "5"});
        assertEquals("shelfLife = 1", outContent.toString().trim());
    }

    @Test
    public void test3() {
        ShelfLife.main(new String[]{"66", "10"});
        assertEquals("shelfLife = 10", outContent.toString().trim());
    }

    @Test
    public void test4() {
        ShelfLife.main(new String[]{"101", "6"});
        assertEquals("shelfLife = 2", outContent.toString().trim());
    }

}
