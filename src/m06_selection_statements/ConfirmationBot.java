package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
### Use a `switch statement` to create a confirmation bot. Given a `response` value as a `char`,
output a message based on the following:

> - if the response is `y` print the message: `Your request is being processed`
> - if the response is `n` print the message: `Thank you for your consideration`
> - if the response is `h` print the message: `Sorry, no live agents are currently available`
> - if the response is anything other than `y, n, or h` print: `Invalid entry, please try again`

Main topics: switch statements, primitive variables

** Example Flows:**
```
Ex:
  Enter command:
  y
  Your request is being processed
```
```
Ex:
  Enter command:
  a
  Invalid entry, please try again
```
```
Ex:
  Enter command:
  n
  Thank you for your consideration
```

 */

public class ConfirmationBot extends TestBase {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        // WRITE YOUR CODE BELOW

        switch (response) {
            case 'y':
                System.out.println("Your request is being processed");
                break;
            case 'n':
                System.out.println("Thank you for your consideration");
                break;
            case 'h':
                System.out.println("Sorry, no live agents are currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again");
                break;
        }
    }

    @Test
    public void test1() {
        provideInput("y");
        ConfirmationBot.main(null);
        assertEquals("Your request is being processed",
                outContent.toString().trim().substring(
                        outContent.toString().trim().lastIndexOf('\n')+1 ));
    }

    @Test
    public void test2() {
        provideInput("n");
        ConfirmationBot.main(null);
        assertEquals("Thank you for your consideration",
                outContent.toString().trim().substring(
                        outContent.toString().trim().lastIndexOf('\n')+1 ));
    }

    @Test
    public void test3() {
        provideInput("h");
        ConfirmationBot.main(null);
        assertEquals("Sorry, no live agents are currently available",
                outContent.toString().trim().substring(
                        outContent.toString().trim().lastIndexOf('\n')+1 ));
    }

    @Test
    public void test4() {
        provideInput("a");
        ConfirmationBot.main(null);
        assertEquals("Invalid entry, please try again",
                outContent.toString().trim().substring(
                        outContent.toString().trim().lastIndexOf('\n')+1 ));
    }
}
