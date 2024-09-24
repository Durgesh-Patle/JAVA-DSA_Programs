import java.util.Scanner;

public class NthFab {
    public static void main(StringMethods[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth Number to print a value:  ");
        int n = sc.nextInt();

        // System.out.print("Fibonacii Series is : "+a+" "+b);

        int a = 0;
        int b = 1;
        int fab=0;
        n--;

        while (n > 0) {
            fab = a + b;
            a = b;
            b = fab;

            n--;
        }
        System.out.println(fab);

    }

}
