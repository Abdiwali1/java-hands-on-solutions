package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
### Use `if statements` to help the student find out which grade level they will join based on their `age`.
Use the following information to determine the results:

```
less than 3   -> ineligible
3-4           -> preschool
5             -> kindergarten
6-10          -> elementary school
11-13         -> middle school
14-18         -> high school
19+           -> college
```

#### Hint: Use a multi branch if statement

Main topics: if statements, primitive variables, operators

Ex:
  age is  8
  Output:
    elementary

  age is  5
  Output:
    kindergarten
 */

public class GradeLevel extends TestBase {
    public static void main(String[] args) {
        int age = args.length > 0 ? Integer.parseInt(args[0]) : 25;

        // WRITE YOUR CODE HERE

        if (age < 3)
            System.out.println("ineligible");
        else if (age < 5)
            System.out.println("preschool");
        else if (age == 5)
            System.out.println("kindergarten");
        else if (age < 11)
            System.out.println("elementary school");
        else if (age < 14)
            System.out.println("middle school");
        else if (age < 19)
            System.out.println("high school");
        else
            System.out.println("college");
    }

    @Test
    public void test1() {
        GradeLevel.main(new String[]{"2"});
        assertEquals("ineligible", outContent.toString().trim());
    }

    @Test
    public void test2() {
        GradeLevel.main(new String[]{"4"});
        assertEquals("preschool", outContent.toString().trim());
    }

    @Test
    public void test3() {
        GradeLevel.main(new String[]{"5"});
        assertEquals("kindergarten", outContent.toString().trim());
    }

    @Test
    public void test4() {
        GradeLevel.main(new String[]{"10"});
        assertEquals("elementary school", outContent.toString().trim());
    }

    @Test
    public void test5() {
        GradeLevel.main(new String[]{"12"});
        assertEquals("middle school", outContent.toString().trim());
    }

    @Test
    public void test6() {
        GradeLevel.main(new String[]{"16"});
        assertEquals("high school", outContent.toString().trim());
    }

    @Test
    public void test7() {
        GradeLevel.main(new String[]{"22"});
        assertEquals("college", outContent.toString().trim());
    }
}
