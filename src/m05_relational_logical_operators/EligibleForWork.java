package m05_relational_logical_operators;

/*
    Write code that assigns true or false to isEligible variable based on age:
    age is 25
    isEligible is true because age is between 18 and 65

    age is 11
    isEligible is false because age is Not between 18 and 65

    Print out the result
 */

public class EligibleForWork {

    public static void main(String[] args) {

        int age = 72;

        boolean isEligible = age >= 18 && age <= 65;

        System.out.println("Am i eligible to work?  "  + isEligible);

    }

}