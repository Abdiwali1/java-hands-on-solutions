package m03_arithmetic_operators;

/*
    Declare integer num1 and num2
    Write a code to swap the values of 2 int variables:
       1. temporary variable
       2. without using temp variable

    num1 is 10
    num2 is 7
    code to swap values
    num1 is 7
    num2 is 10

 */

public class SwapValues {
    public static void main(String[] args) {
        // By using Temporary Variable

//        int num1 = 10;
//        int num2 = 7;
//
//        int temp;
//
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);

        // Without using Temporary Variable

        int num1 = 10;
        int num2 = 7;

        num2 = num2 + num1;
        num1 = num2 - num1;
        num2 = num2 - num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
