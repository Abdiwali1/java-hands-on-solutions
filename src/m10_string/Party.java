package m10_string;

/*
    Use a loop and Scanner to create a guest list for the party. Ask the user to enter the full name of the guest, store the name into the guest list and ask if they want to enter another guest name.

    - If the user says `yes` then ask them for the next guest's name and repeat the process
    - If the user says `no` then stop asking for names and display the final guest list

    Also ensure the names in the list are in a proper format (first letter uppercase and rest lowercase) and that there is no duplicate names. A duplicate will be if the first and last name are the same

    Example Flows:
        Please enter the guest's name:
          Nick Cage
        Do you want to enter another guest's name?
          yes
        Please enter the guest's name:
          Linda Rosy
        Do you want to enter another guest's name?
          no
        Guests' list: Nick Cage, Linda Rosy

 */

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Party extends TestBase {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);
        String guestList = "Guests' list: ";
        String moreGuests = "yes";

        do{
            System.out.println("Please enter the guest's name:");
            String guestName = input.nextLine().trim();
            guestName = fixFormat(guestName);

            if(!guestList.contains(guestName)){ // the name is unique. it is the first time this name is appearing
                guestList += guestName + ", ";
            }

            System.out.println("Do you want to enter another guest's name?");
            moreGuests = input.nextLine();

        } while (moreGuests.equalsIgnoreCase("yes")); // if the String is anything besides yes then the loop stops

        System.out.println(guestList.substring(0, guestList.length() - 2));

    }

    public static String fixFormat(String name){ // nIcK cAGE
        name = name.toLowerCase();
        int space = name.indexOf(' ');
        String firstName = name.substring(0, space);
        String lastName = name.substring(space + 1);

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        return firstName + " " + lastName;
    }

    // TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        provideInput("Nick Cage", "yes", "Linda Rosy", "no");
        main(null);
        String expected = "Guests' list: Nick Cage, Linda Rosy";
        assertEquals(expected, simplifyOutput("Guests' list:"));
    }

    @Test
    public void test2() {
        provideInput("Miller Cook", "yes", "Roselyn Callahan", "yes", "Oscar Vaughan", "yes", "Oscar Vaughan", "yes", "Miller Cook", "yes", "Miller Byrd", "no");
        main(null);
        String expected = "Guests' list: Miller Cook, Roselyn Callahan, Oscar Vaughan, Miller Byrd";
        assertEquals(expected, simplifyOutput("Guests' list:"));
    }

    @Test
    public void test3() {
        provideInput("CADEN ARROYO", "yes", "zOIe nelSON", "yes", "Mara Blair", "yes", "jaX wOLF", "no");
        main(null);
        String expected = "Guests' list: Caden Arroyo, Zoie Nelson, Mara Blair, Jax Wolf";
        assertEquals(expected, simplifyOutput("Guests' list:"));
    }

    @Test
    public void test4() {
        provideInput("FELipe AlvARez", "yes", "feLIPe ALVarEZ", "yes", "Phillip Zavala", "yes", "PhiLLip ZaVALA", "yes", "Scarlet Tate", "yes", "FELipe Tate", "no");
        main(null);
        String expected = "Guests' list: Felipe Alvarez, Phillip Zavala, Scarlet Tate, Felipe Tate";
        assertEquals(expected, simplifyOutput("Guests' list:"));
    }

}
