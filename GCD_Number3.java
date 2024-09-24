import java.util.Scanner;

public class GCD_Number3 {
    public static int GCD(int a,int b){
        if(b==0){
            return a;
        }
        return GCD(b, a%b);
    }

    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter Two Number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        // a=5;
        // b=6;
        System.out.println("GCD Number: "+GCD(a, b));
    }
}
