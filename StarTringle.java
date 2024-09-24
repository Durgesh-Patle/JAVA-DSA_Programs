import java.util.Scanner;

public class StarTringle {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
                for (int x = 0; x <= i; x++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
