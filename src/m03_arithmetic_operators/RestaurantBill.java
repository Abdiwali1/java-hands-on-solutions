package m03_arithmetic_operators;

/*
    Restaurant bill calculator
    Calculate tip, tax, and total Bill Amount
    1. Declare and initialize double bill
    2. Declare and initialize double tipPercentage
    3. Calculate tip (tipPercentage / 100 * bill)
    4. Calculate tax as 5% (billAmount * 0.05)
    5. Calculate totalBill by adding bill, tip and tax
    6. Print out values
    Example:
        bill = 50.0
        tax = 2.5
        tip = 5.0
        totalBill = 57.5
 */

public class RestaurantBill {
    public static void main(String[] args) {
        double bill = 50.0;
        double tipPercentage = 10;
        double tip = tipPercentage / 100 * bill;
        double tax = bill * 0.05;
        double totalBill = bill + tip + tax;

        System.out.println("bill = " + bill);
        System.out.println("tax = " + tax);
        System.out.println("tip = " + tip);
        System.out.println("totalBill = " + totalBill);
    }
}
