import java.util.Scanner;

public class IsPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        boolean cheack = true;
        if (n == 0) {
            cheack = false;
            // System.out.println("no");
        }

        while (n > 1) {
            if (n % 2 == 1) {
                cheack = false;
                break;
            }

            n /= 2;
        }
        if (cheack == false) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }

        // 2.

        // if(n==0){
        // System.out.println("no");
        // }
        // else if ((n & (n - 1)) == 0) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("no");
        // }
    }
}
