import java.util.Scanner;

public class PowerCalculate {
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        long n=sc.nextLong();
        System.out.print("Enter This Number to Power Find: ");
        long p=sc.nextLong();

        int ans=1;

        while (p-->0) {
            ans*=n;
            // p--;
        }
 
        System.out.println(ans);

    }
}
