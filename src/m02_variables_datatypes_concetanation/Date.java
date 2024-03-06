package m02_variables_datatypes_concetanation;
/*
1. Declare and initialize integer variables month, day, year.
2. Print each variable separately
    "Day = 10"
3. Use concatenation and print in a "month/day/year" format
    "10/11/2023"
 */
public class Date {
    public static void main(String[] args) {

        int month = 10;
        System.out.println("month = " + month);

        int day;
        day = 14;
        System.out.println("day = " + day);

        int year = 2023;
        System.out.println("year = " + year);

        //print 10/14/2023 using variables
        System.out.println(month+"/"+day+"/"+year);
    }
}
