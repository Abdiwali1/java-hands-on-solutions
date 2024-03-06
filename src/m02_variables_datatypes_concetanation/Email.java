package m02_variables_datatypes_concetanation;

/*
 1. Declare and Initialize String variables firstName,lastName,company
 2. Declare String variable email and  format value by building email using above variables:
    firstName.lastName@company.com
 3. Print out email value
    email = firstName.lastName@company.com
 */

public class Email {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Smith";
        String company = "amazon";
        
        String email = firstName+"."+lastName+"@"+company+".com";
        System.out.println("email = " + email);
                
    }
}
