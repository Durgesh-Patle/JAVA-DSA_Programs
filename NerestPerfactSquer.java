import java.util.Scanner;

public class NerestPerfactSquer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
//  1....
        // while (n>0) {
        //     if ( Math.sqrt(n) == (int) Math.sqrt(n)) {
        //         System.out.println(n);
        //         break;
        //     }
        //     n--;
        // }

// 2....
       int root=(int)Math.sqrt(n);
       System.out.println(root*root);
    }
}
