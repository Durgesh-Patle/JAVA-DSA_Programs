import java.util.Scanner;

public class IsPowerOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n == 0)
            System.out.println("no");

        while (n % 3 == 0) {
            n /= 3;
            System.out.println(n);
        }

        if (n == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
