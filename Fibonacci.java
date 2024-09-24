// package DSA _Basics;
import java.util.Scanner;

public class Fibonacci {

    public static void main(StringMethods[] args) {
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        System.out.print("Fibonacii Series is : "+a+" "+b);
        int fab;
        for (int i = 2; i <= n; i++) {
            fab = a + b;
            a = b;
            b = fab;
            System.out.print(" "+fab);
        }
    }

}
