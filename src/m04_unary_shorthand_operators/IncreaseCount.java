package m04_unary_shorthand_operators;

/*
    declare and initialize variable count
    increase value by one using 3 different ways
    1. arithmetic operator
    2. unary increment operator
    3. shorthand operator
 */

public class IncreaseCount {
    public static void main(String[] args) {
        int count = 1;
        count = count + 1;
        count++;
        count += 1;
        System.out.println("count = " + count);
    }
}
