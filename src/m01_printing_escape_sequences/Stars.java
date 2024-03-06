package m01_printing_escape_sequences;

/*
Write a code to print the following output in the console.

    *
   ***
  *****
 *******
*********
Version 1: using multiple println statements
Version 2: using single println statement with escape sequence
 */

public class Stars {
    public static void main(String[] args) {
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");

        System.out.println("---Version 2---");
        System.out.println("    *\n   ***\n  *****\n *******\n*********");

    }
}
