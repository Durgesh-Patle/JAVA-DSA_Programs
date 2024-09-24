import java.util.Scanner;

public class Leap_Year {
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Year: ");
        int year=sc.nextInt();

        // int year =2022;

        // if(year%4==0){
        //     if(year%100==0){
        //         if(year%400==0){
        //             System.out.println("leap Year");
        //         }
        //         else{
        //             System.out.println("Not Leap Year");
        //         }
        //     }
        //     else{
        //         System.out.println("Leap Year");
        //     }
        // }
        // else{
        //     System.out.println("Not Leap Year");
        // }


        if((year%400==0) || (year%4==0 && year%100==0))
        {
            System.out.println("Leap Yaer");
        }
        else{
            System.out.println("Not Leap year");
        }


    }
}
