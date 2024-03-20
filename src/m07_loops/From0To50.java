package m07_loops;

import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


/*
    Use a `loop` to print all the numbers from `0` to `50`.  Print each number on a new line

    Example Flow:

    0
    1
    2
    3
    4
    5
    ...
    48
    49
    50
 */

public class From0To50 extends TestBase {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE

        for(int i = 0; i <= 50; i++){
            System.out.println(i);
        }


    }

// TESTS: DO NOT CHANGE

    @Test
    public void test1() {
        main(null);
        String expected = IntStream.rangeClosed(0, 50).mapToObj(Integer::toString).reduce((s, s2) -> s + "\n"  +s2).orElse("");
        assertEquals(expected, outContent.toString().trim());
    }

}