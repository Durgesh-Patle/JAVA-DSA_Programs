import java.util.Scanner;

public class Prime_Number {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Number: ");
            int num=sc.nextInt();

            // int num = 29; // Change this to the number you want to check

            boolean flag = false;
            
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
