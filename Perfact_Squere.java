import java.util.Scanner;

public class Perfact_Squere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sc.nextInt();

        // double d = Math.sqrt(n);
 // 1..
        // if ( Math.sqrt(n) == (int) Math.sqrt(n)) {
        // System.out.println("yes");
        // } else {
        // System.out.println("no");
        // }


// 2..

        if (Math.sqrt(n) - (int) Math.sqrt(n)==0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
