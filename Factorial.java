// package DSA _Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // System.out.println("Hello");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int num=sc.nextInt();

        int fab=1;

        for(int i=num;i>=1;--i){
            fab*=i;
        }

        // for(int i=num;i>=1;--i){
        //     fab*=i;
        // }
        System.out.println(fab);
    }
    
}
