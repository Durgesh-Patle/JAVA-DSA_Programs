import java.util.Scanner;

public class fload_Tringle {
    public static void main(StringMethods[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();

        int number = 1;

        // Outer Loop.
        for (int i = 1; i <= n; i++) {
            // inner Loop for Print the Space.
            for (int j = 1; j <= i; j++) {
                System.out.print(number+" ");
                number ++;
            }
            System.out.println();
        }

    }
}
