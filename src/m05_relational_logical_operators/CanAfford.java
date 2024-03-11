package m05_relational_logical_operators;

/*
    Write code that assigns true or false to canAfford variable:
    accountBalance is 350.0
    itemPrice is 254.99
    canAfford is true because accountBalance is more than itemPrice.

    accountBalance is 356.0
    itemPrice is 550.55
    canAfford is false because accountBalance is less than itemPrice.
 */

public class CanAfford {
    public static void main(String[] args) {
        double accountBalance = 350.0;
        double itemPrice = 254.99;
        System.out.println(accountBalance >= itemPrice);
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);
    }
}
