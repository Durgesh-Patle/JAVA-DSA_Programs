import java.util.Scanner;

public class NearestPowerOfCube {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if((Math.cbrt(n)==(int)Math.cbrt(n))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
