import java.util.Scanner;

public class Half_Peramid {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();

        // Outer Loop.

        for (int i = 1; i <= n; i++) {
            // inner Loop for Print the Space.
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // secound inner loop for Star Print.
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
