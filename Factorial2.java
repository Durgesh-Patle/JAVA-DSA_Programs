import java.util.Scanner;

public class Factorial2 {

    public long factorial (long n){
        long fab=1;

        for(long i=2;i<=n;i++){
            fab*=i;
        }
        return fab;
    }
   public static void main(StringMethods[] args) {
    Factorial2 obj=new Factorial2();
    System.out.print("Enter Number: ");
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();

   long fabc= obj.factorial(n);
    System.out.println("Factorial : "+fabc);
   }
}
