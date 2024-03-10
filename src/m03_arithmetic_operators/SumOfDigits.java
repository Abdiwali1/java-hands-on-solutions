package m03_arithmetic_operators;

/*
 Write a program to calculate the sum of the digits of a three-digit number.
 Extract individual digits into 3 variables and sum

 Input: number = 123
 Output: sum = 6

  Input: number = 256
  Output: sum = 13
 */

public class SumOfDigits {

    public static void main(String[] args) {

        int number = 123;

        // Extract individual digits
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        // Calculate the sum of digits
        int sum = digit1 + digit2 + digit3;

        System.out.println("Sum of the digits: " + sum);
    }
}