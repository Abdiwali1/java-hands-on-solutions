package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Given the integer variables speedLimit and currentSpeed, Write an if/else statement that calculates ticketAmount:
If currentSpeed is more than speedLimit, ticketAmount is $6 for each mile over the limit plus $51 processing fee.
if speeding, print out the result as below:
    ticketAmount = $183
If not speeding:
    Not speeding

Ex:
 speedLimit is 55, currentSpeed is 85
  Output:
    ticketAmount = $231

 speedLimit is 55, currentSpeed is 50
  Output:
    Not speeding
 */

public class SpeedingTicket extends TestBase {
    public static void main(String[] args) {
        int speedLimit = args.length > 0 ? Integer.parseInt(args[0]) : 55;
        int currentSpeed = args.length > 0 ? Integer.parseInt(args[1]) : 85;
        int ticketAmount;

        //WRITE YOUR CODE HERE:
        if (currentSpeed > speedLimit) {
            int milesOverLimit = currentSpeed - speedLimit;
            ticketAmount = milesOverLimit * 6 + 51;
            System.out.println("ticketAmount = $" + ticketAmount);
        }else {
            System.out.println("Not speeding");
        }
    }

    @Test
    public void test1() {
        SpeedingTicket.main(new String[]{"55", "123"});
        assertEquals("ticketAmount = $459", outContent.toString().trim());
    }

    @Test
    public void test2() {
        SpeedingTicket.main(new String[]{"60", "85"});
        assertEquals("ticketAmount = $201", outContent.toString().trim());
    }

    @Test
    public void test3() {
        SpeedingTicket.main(new String[]{"55", "55"});
        assertEquals("Not speeding", outContent.toString().trim());
    }

    @Test
    public void test4() {
        SpeedingTicket.main(new String[]{"65", "60"});
        assertEquals("Not speeding", outContent.toString().trim());
    }
}
