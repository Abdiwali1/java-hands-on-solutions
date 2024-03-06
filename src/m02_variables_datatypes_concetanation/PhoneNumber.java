package m02_variables_datatypes_concetanation;

/*
Declare two int variables areaCode, localNumber and assign values, print out by
combining them together into a phone number in the following format:
  (areaCode)-localNumber
 */

public class PhoneNumber {
    public static void main(String[] args) {
        int areaCode = 303;
        int localNumber = 5552345;


        // WRITE YOUR CODE HERE:
        String phoneNumber;
        phoneNumber = "(" + areaCode + ")-" + localNumber;

        System.out.println("Calling number " + phoneNumber);
    }
}
