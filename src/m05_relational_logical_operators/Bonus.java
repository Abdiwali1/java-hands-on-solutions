package m05_relational_logical_operators;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Given the integer variables yearsWithCompany and department, write expression that
    assigns true or false to hasBonus boolean variable based on rule below.
    Bonus is given to employees who worked for company 5 years or more AND work in departments 10 and 15.

    yearsWithCompany is 5 and department is 10
    hasBonus = true

    yearsWithCompany is 7 and department is 5
    hasBonus = false

    yearsWithCompany is 2 and department is 15
    hasBonus = false

 */
public class Bonus extends TestBase {
    public static void main(String[] args) {
        //Do not change below code
        int yearsWithCompany,department;
        if (args.length == 2) {
            yearsWithCompany = Integer.parseInt(args[0]);
            department = Integer.parseInt(args[1]);
        } else {
            yearsWithCompany = 0;
            department = 0;
        }
        //Write your code here
        boolean hasBonus = yearsWithCompany >= 5 && (department == 10 || department == 15);
        System.out.println("hasBonus = " + hasBonus);
    }

    //Do not change below unit tests code
    @Test
    public void test1() {
        Bonus.main(new String[]{"5", "15"});
        assertEquals("hasBonus = true", outContent.toString().trim());
    }

    @Test
    public void test2() {
        Bonus.main(new String[]{"7", "5"});
        assertEquals("hasBonus = false", outContent.toString().trim());
    }

    @Test
    public void test3() {
        Bonus.main(new String[]{"1", "10"});
        assertEquals("hasBonus = false", outContent.toString().trim());
    }

    @Test
    public void test4() {
        Bonus.main(new String[]{"7", "10"});
        assertEquals("hasBonus = true", outContent.toString().trim());
    }
}
