import java.util.Scanner;

public class OpositeTrangle {
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                // System.out.print(j+" ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
