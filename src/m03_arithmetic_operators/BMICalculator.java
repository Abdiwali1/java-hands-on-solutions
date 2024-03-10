package m03_arithmetic_operators;

/*
    Program to calculate Body Mass Index
    Formula metric system => weight / (height ^ 2)

    1. Declare and initialize weight(kg) and height(meters) variables
    2. Calculate BMI value using above formula and assign to bmi variable
    3. Print out the result
 */

public class BMICalculator {
    public static void main(String[] args) {
        double weight = 75;
        double height = 1.66;
        double BMI = weight / (height * height);
        System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}
