package m04_unary_shorthand_operators;

/*
    Declare and initialize currentPrice
    Declare and initialize discountPercentage
    Declare discountAmount variable and calculate the actual amount using above variables
    Decrease currentPrice by discountAmount using shorthand operator

    currentPrice is 37.50
    discountPercentage is 8.0
    currentPrice after discount 34.5
 */

public class OnSale {
    public static void main(String[] args) {
        double currentPrice = 100;
        double discountPercentage = 8.0;
        double discountAmount = discountPercentage / 100 * currentPrice;
        System.out.println("discountAmount = " + discountAmount);

        currentPrice -= discountAmount;
        System.out.println("currentPrice = " + currentPrice);

    }
}
