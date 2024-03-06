package m02_variables_datatypes_concetanation;
/*
   Declare and initialize Variables: name as String, price as double, number of reviews as int,
    rating as float, onSale as boolean
    ----- PRODUCT INFORMATION -----
    Blink Video Doorbell
    $129.98
    115116 ratings
    4.3 * * * * *
    onSale = true
 */
public class ProductInfo {
    public static void main(String[] args) {
        String name = "Blink Video Doorbell";
        double price = 129.98;
        int numberOfReviews = 115116;
        float rating = 4.3f;
        boolean onSale = true;

        //print variable values
        System.out.println("----- PRODUCT INFORMATION -----");
        System.out.println(name);
        System.out.println("$"+price); //$129.98
        System.out.println(numberOfReviews + " ratings");
        System.out.println(rating + " * * * * *");
        System.out.println("onSale = " + onSale);
    }
}
