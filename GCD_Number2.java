import java.util.Scanner;

public class GCD_Number2 {
    public static int GCD(int a,int b){
        int i=Math.min(a, b);

        while(i>0){
            if(a%i==0 && b%i==0){
                return i;
            }
            i--;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD Number: "+GCD(a, b));

    }

}
