import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();

        int rev=0, z=n;

        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;
        }

        // System.out.println("Reverce Number: "+rev);

        if(rev==z){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not A Palindrome Number.");
        }
    }
}
