import java.util.Scanner;

public class CountSum_Print {
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            System.out.println(i);
        }
        System.out.println("Sum is: "+sum);
    }
}
