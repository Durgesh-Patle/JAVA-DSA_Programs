import java.util.Scanner;

public class Avarage_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Secound Number: ");
        int b=sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c=sc.nextInt();

        int sum=a+b+c;
        System.out.println("sum is: "+sum);

        int avg=sum/3;
        System.out.println("Avarage is: "+avg);
    }
}
