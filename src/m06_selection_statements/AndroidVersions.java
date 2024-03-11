package m06_selection_statements;


import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
### Android is one of the popular mobile operating systems.
The versions in android systems follow names related to sweets.
You will need to take the given `version` value to output the name of the current version.
Use the follow chart to determine the versions:

#### Note: The `version` will be given as a `String`

**Versions**
> - 1.5 - Cupcake
> - 1.6 - Donut
> - 2.1 - Eclair
> - 2.2 - Froyo
> - 2.3 - Gingerbread
> - 3.1 - Honeycomb
> - 4.0 - Ice Cream Sandwich
> - 4.1 - Jelly Bean
> - 4.4 - KitKat
> - 5.0 - Lollipop
> - 8.0 - Oreo
> - 9.0 - Pie
> - Any other number is invalid and should display: Not a valid version

#### Note: Its possible to use if statements to complete this, but use switch statement for practice. Or for even more practice, complete the task twice, once using each different conditional statement.

Main topics: switch statements, primitive variables, Scanner

Examples:
```
Ex:
  Input:
    1.5

  Output:
    Cupcake
```
```
Ex:
  Input:
    9.0

  Output:
    Pie
```
```
Ex:
  Input:
    11.0

  Output:
    Not a valid version
```
 */

public class AndroidVersions extends TestBase {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String version = input.nextLine();

        //WRITE YOUR CODE BELOW:
        switch (version) {
            case "1.5":
                System.out.println("Cupcake");
                break;
            case "1.6":
                System.out.println("Donut");
                break;
            case "2.1":
                System.out.println("Eclair");
                break;
            case "2.2":
                System.out.println("Froyo");
                break;
            case "2.3":
                System.out.println("Gingerbread");
                break;
            case "3.1":
                System.out.println("Honeycomb");
                break;
            case "4.0":
                System.out.println("Ice Cream Sandwich");
                break;
            case "4.1":
                System.out.println("Jelly Bean");
                break;
            case "4.4":
                System.out.println("KitKat");
                break;
            case "5.0":
                System.out.println("Lollipop");
                break;
            case "8.0":
                System.out.println("Oreo");
                break;
            case "9.0":
                System.out.println("Pie");
                break;
            default:
                System.out.println("Not a valid version");
        }
    }

    @Test
    public void test1() {
        provideInput("1.5");
        main(null);
        assertEquals("Cupcake", outContent.toString().trim());
    }

    @Test
    public void test2() {
        provideInput("1.6");
        main(null);
        assertEquals("Donut", outContent.toString().trim());
    }

    @Test
    public void test3() {
        provideInput("2.1");
        main(null);
        assertEquals("Eclair", outContent.toString().trim());
    }

    @Test
    public void test4() {
        provideInput("2.2");
        main(null);
        assertEquals("Froyo", outContent.toString().trim());
    }

    @Test
    public void test5() {
        provideInput("2.3");
        main(null);
        assertEquals("Gingerbread", outContent.toString().trim());
    }

    @Test
    public void test6() {
        provideInput("3.1");
        main(null);
        assertEquals("Honeycomb", outContent.toString().trim());
    }

    @Test
    public void test7() {
        provideInput("4.0");
        main(null);
        assertEquals("Ice Cream Sandwich", outContent.toString().trim());
    }

    @Test
    public void test8() {
        provideInput("4.1");
        main(null);
        assertEquals("Jelly Bean", outContent.toString().trim());
    }

    @Test
    public void test9() {
        provideInput("4.4");
        main(null);
        assertEquals("KitKat", outContent.toString().trim());
    }

    @Test
    public void test10() {
        provideInput("5.0");
        main(null);
        assertEquals("Lollipop", outContent.toString().trim());
    }

    @Test
    public void test11() {
        provideInput("8.0");
        main(null);
        assertEquals("Oreo", outContent.toString().trim());
    }

    @Test
    public void test12() {
        provideInput("9.0");
        main(null);
        assertEquals("Pie", outContent.toString().trim());
    }

    @Test
    public void test13() {
        provideInput("9.6");
        main(null);
        assertEquals("Not a valid version", outContent.toString().trim());
    }
}
