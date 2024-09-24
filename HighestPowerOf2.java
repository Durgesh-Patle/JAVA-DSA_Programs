import java.util.Scanner;

public class HighestPowerOf2 {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        while (n > 0) {
            if ((n & (n - 1)) == 0) {
                System.out.println(n);
                break;            
            }
            n--;
        }

    }
}
