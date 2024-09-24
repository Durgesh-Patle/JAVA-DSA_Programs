import java.util.Scanner;
public class NearestPowerOf3 {

    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        while (n>0) {
            if ( Math.cbrt(n) == (int) Math.cbrt(n)) {
                System.out.println(n);
                break;
            } 
            n--;
        }
    }
}

