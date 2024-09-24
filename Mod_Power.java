import java.util.Scanner;

public class Mod_Power {

    public static long modpower(long n, long p, long m) {
        long ans = 1;
        while (p-- > 0) {
            ans = (ans * n) % m;
        }
        return ans % m;
    }

    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        long n = sc.nextLong();

        System.out.println("Enter Power: ");
        long p = sc.nextLong();

        long m = 1000000;

        System.out.println(modpower(n, p, m));
    }
}
