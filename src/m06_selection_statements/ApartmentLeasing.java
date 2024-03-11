package m06_selection_statements;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
### Use `if statements` to find the cost of leasing an apartment based on the number of bedrooms.
Use the `numberOfBedrooms` variable and these rates to get the final price:

        > - 1 bedroom: 1100
        > - 2 bedroom: 1850
        > - 3 bedroom: 2550

        #### Note: If an invalid bedroom number is given no price is displayed

        #### Note: Can use multiple if statements or a multi branch if statement

        Main topics: if statements, primitive variables, concatenation, operators

        **Example Flows:**
        ```
        Welcome to Cydeo Apartments!
        How many bedrooms are you looking for?
        1
        One Bedroom Selected
        Starting Price: 1100
        ```

        ```
        Welcome to Cydeo Apartments!
        How many bedrooms are you looking for?
        3
        Three Bedroom Selected
        Starting Price: 2550
        ```

        ```
        Welcome to Cydeo Apartments!
        How many bedrooms are you looking for?
        5
        Sorry, we do not offer that many bedrooms

        ```
*/

public class ApartmentLeasing extends TestBase {
    public static void main(String[] args) {
        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");
        int numberOfBedrooms = args.length > 0 ? Integer.parseInt(args[0]) : 1;

        //WRITE YOUR CODE HERE:
        switch (numberOfBedrooms) {
            case 1:
                System.out.println("One Bedroom Selected\nStarting Price: 1100");
                break;
            case 2:
                System.out.println("Two Bedroom Selected\nStarting Price: 1850");
                break;
            case 3:
                System.out.println("Three Bedroom Selected\nStarting Price: 2550");
                break;
            default:
                System.out.println("Sorry, we do not offer that many bedrooms");
        }
    }

    @Test
    public void test1() {
        ApartmentLeasing.main(new String[]{"1"});
        assertEquals("One Bedroom Selected\nStarting Price: 1100", outContent.toString().trim().substring(outContent.toString().trim().lastIndexOf('\n',outContent.toString().trim().lastIndexOf('\n')-1)+1 ));
    }

    @Test
    public void test2() {
        ApartmentLeasing.main(new String[]{"2"});
        assertEquals("Two Bedroom Selected\nStarting Price: 1850", outContent.toString().trim().substring(outContent.toString().trim().lastIndexOf('\n',outContent.toString().trim().lastIndexOf('\n')-1)+1 ));
    }

    @Test
    public void test3() {
        ApartmentLeasing.main(new String[]{"3"});
        assertEquals("Three Bedroom Selected\nStarting Price: 2550", outContent.toString().trim().substring(outContent.toString().trim().lastIndexOf('\n',outContent.toString().trim().lastIndexOf('\n')-1)+1 ));
    }

    @Test
    public void test4() {
        ApartmentLeasing.main(new String[]{"4"});
        assertEquals("Sorry, we do not offer that many bedrooms", outContent.toString().trim().substring(outContent.toString().trim().lastIndexOf('\n')+1 ));
    }

}
