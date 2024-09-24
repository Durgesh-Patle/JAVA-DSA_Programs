import java.util.Scanner;

// GCD - Greatest Common Divisor.
// HCF - Highest Common Fcator.

public class GCD_Number {
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Two Number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int g=0;

        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                g=i;
                // System.out.println(i);
            }
        }
        System.out.println("GCD Number: "+g);
    }
}
