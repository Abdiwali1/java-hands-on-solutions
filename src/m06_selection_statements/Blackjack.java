package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Use if statements to help the Blackjack dealer determine who won.
There will be an int house and player variables. Use the following rules of blackjack to print out the result:

if the player score is bigger than 21, the result is player bust
if the player score is equal to the house score, the result is its a tie
if the player score is equal to 21, the result is player win
if the house score is bigger than the player score, the result is player lose
if the player score is bigger than the house score, the result is player win
EX:
Input:
    house is 8, player is 21
        Output:
             player win

    house is 10, player is 7
        Output:
             player lose

    house is 4, player is 4
        Output:
              its a tie
 */

public class Blackjack extends TestBase {
    public static void main(String[] args) {
        int house = args.length > 0 ? Integer.parseInt(args[0]) : 55;
        int player = args.length > 0 ? Integer.parseInt(args[1]) : 85;

        //WRITE YOUR CODE BELOW

        if (player > 21) {
            System.out.println("player bust");
        } else if (house == player) {
            System.out.println("its a tie");
        } else if (player == 21) {
            System.out.println("player win");
        } else if (house > player) {
            System.out.println("player lose");
        } else if (player > house) {
            System.out.println("player win");
        }
    }

    @Test
    public void test1() {
        Blackjack.main(new String[]{"8", "21"});
        assertEquals("player win", outContent.toString().trim());
    }

    @Test
    public void test2() {
        Blackjack.main(new String[]{"10", "7"});
        assertEquals("player lose", outContent.toString().trim());
    }

    @Test
    public void test3() {
        Blackjack.main(new String[]{"4", "4"});
        assertEquals("its a tie", outContent.toString().trim());
    }

    @Test
    public void test4() {
        Blackjack.main(new String[]{"10", "25"});
        assertEquals("player bust", outContent.toString().trim());
    }

    @Test
    public void test5() {
        Blackjack.main(new String[]{"7", "12"});
        assertEquals("player win", outContent.toString().trim());
    }

}
