package m01_printing_escape_sequences;
/*
Write a code to print the following output in the console

    MCLEAN STORE
2019-06-19     04:38PM
Gallons:       10.870
Price/gallon:  $2.089
Fuel total:    $22.71

 */
public class GasReceipt {
    public static void main(String[] args) {
        System.out.println("\t\tMCLEAN STORE");
        System.out.println("2019-06-19\t\t04:38PM");
        System.out.println("Gallons:\t\t10.870");
        System.out.println("Price/gallon:\t$2.089");
        System.out.println("Fuel total:\t\t$22.71");
    }
}
