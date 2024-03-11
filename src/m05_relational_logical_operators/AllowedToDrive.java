package m05_relational_logical_operators;

/*
 Write a program that determines if one is allowed to drive.

allowedToDrive is true if it matches below requirements  based on age, hasLearningPermit,
hasDriverLicense variables.

 According to the Virginia State Law, in order to drive,
 a resident must be over 18 and have a driver’s license,
 or must be over 15 years and 6 months old and have a learner’s permit.
*/

public class AllowedToDrive {

    public static void main(String[] args) {

        double age = 20.0;

        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;

        boolean allowedToDrive = (age >= 18 && hasDriverLicense) || (age >= 15.5 && hasLearningPermit);

        System.out.println("Is Mike allowed to drive?   " + allowedToDrive);


    }

}