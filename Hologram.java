
// package DSA _Basics;
import java.util.Scanner;

public class Hologram {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        // for (int i = 0; i < num; i++) {
        // for (int j = 0; j < num; j++) {
        // if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
        // System.out.print("* ");
        // } else {
        // System.out.println(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n = 5; // size of the pattern

        //  Chat gpt.
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // print star at the first row, last row,
                // first column, and last column
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // print space elsewhere
                }
            }
            System.out.println(); // new line after each row
        }
    }

}
