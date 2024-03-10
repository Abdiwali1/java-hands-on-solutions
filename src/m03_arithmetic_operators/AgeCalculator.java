package m03_arithmetic_operators;
/*
    Program to calculate age using birth and current years.
    1. Declare integer variables birthYear and currentYear
    2. Calculate age then assign value to age variable
    3. print out age variable value
 */
public class AgeCalculator {
    public static void main(String[] args) {
        int birthYear = 1990;
        int currentYear = 2023;
        int age = currentYear - birthYear;

        System.out.println("age = " + age);
    }
}
