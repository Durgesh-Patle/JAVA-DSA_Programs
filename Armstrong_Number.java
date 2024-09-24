// package DSA _Basics;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        int z, count = 0, digit, pro, sum=0;

        z = n;
        
        while (z > 0) {
            count += 1;
            z = z / 10;
        }
        System.out.println("Number Of digits: " + count);

        z = n;
        
        while (z > 0) {
            digit = z % 10;
            pro = 1;
            for (int i = 1; i <= count; i++) 
                pro *= digit;
                sum += pro;
                z = z / 10;
        }

        if(sum==n){
            System.out.println("Armstrong Number.");
        }
        else{
            System.out.println("Not a Armstrong Number.");
        }

    }

}
