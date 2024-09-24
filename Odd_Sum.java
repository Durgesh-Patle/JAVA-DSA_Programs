import java.util.Scanner;

public class Odd_Sum {
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();

        int sum=0;

        for(int i=0;i<=n;i++){
            if(i%2!=0){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("Odd Sum is: "+sum);
    }
}
