package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
### Use `if statements` to determine if the given `int` `num` is positive, negative, or zero.
Only print one of these three options.

#### Note: Can be done with 3 separate if statement or a multi branch if statement

Ex:
  num is 1
  Output: positive

  num is -6
  Output: negative

  num is 0
  Output: zero
 */

public class PositiveNegativeOrZero extends TestBase {
    public static void main(String[] args) {
        int num = args.length > 0 ? Integer.parseInt(args[0]) : 1;

        //WRITE YOUR CODE BELOW:
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    @Test
    public void test1() {
        PositiveNegativeOrZero.main(new String[]{"15"});
        assertEquals("positive", outContent.toString().trim());
    }

    @Test
    public void test2() {
        PositiveNegativeOrZero.main(new String[]{"-10"});
        assertEquals("negative", outContent.toString().trim());
    }

    @Test
    public void test3() {
        PositiveNegativeOrZero.main(new String[]{"0"});
        assertEquals("zero", outContent.toString().trim());
    }
}
