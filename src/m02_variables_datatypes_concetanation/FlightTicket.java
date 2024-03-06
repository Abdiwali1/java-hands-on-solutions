package m02_variables_datatypes_concetanation;

/*
Declare and initialize String variables city1  , city2 and double oneWayFare
constant char variable DOLLAR and assign '$' unicode decimal value
Print in below format:
From Chicago to San Fransisco one way cost is $643.5
 */

public class FlightTicket {
    public static void main(String[] args) {
        String city1 = "Chicago";
        String city2 = "San Fransisco";
        double oneWayFare = 643.50;
        final char DOLLAR = 36;//'$';

        System.out.println("From " + city1 + " to " + city2 + " one way cost is " + DOLLAR + oneWayFare);

    }
}
