import java.util.Scanner;

public class Butterfly {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // Upper Half.
        for (int i = 1; i <= n; i++) {
            // 1st part.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces.
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd Part.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        // Lower half.
        for (int i = n; i >= 1; i--) {
            // 1st Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd Part.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
