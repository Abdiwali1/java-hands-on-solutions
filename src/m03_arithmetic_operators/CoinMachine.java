package m03_arithmetic_operators;

/*
 Coin machine program
 -Lets you insert coins and returns back dollars, quarters, dimes, nickels, cents

 example output:
    coins = 467
    dollars = 4
    quarters = 2
    dimes = 1
    nickels = 1
    cents = 2
 */

public class CoinMachine {
    public static void main(String[] args) {
        int coins = 467;
        System.out.println("coins = " + coins);

        //calculate dollars
        int dollars = coins / 100;
        coins = coins % 100;

        //calculate quarters
        int quarters = coins / 25;
        coins = coins % 25;

        //calculate dimes
        int dimes = coins / 10;
        coins = coins % 10;

        //calculate nickels
        int nickels = coins / 5;
        coins = coins % 5;

        //calculate cents
        int cents = coins;

        System.out.println("dollars = " + dollars);
        System.out.println("quarters = " + quarters);
        System.out.println("dimes = " + dimes);
        System.out.println("nickels = " + nickels);
        System.out.println("cents = " + cents);
    }
}
