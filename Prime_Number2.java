import java.util.Scanner;

public class Prime_Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int n = 2;
        while (num > 0) {
            boolean cheack = true;
            
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    cheack = false;
                    break;
                }
            }

            if (cheack == true) {
                // Prime No is Find
                num--;
            }
            n++;

        }
        System.out.println(n - 1);

    }
}
