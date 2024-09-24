import java.util.Scanner;

public class LCM_Number {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = (a > b) ? a : b;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM Number: " + lcm);
                break;
            }
            ++lcm;

        }

    }
}
