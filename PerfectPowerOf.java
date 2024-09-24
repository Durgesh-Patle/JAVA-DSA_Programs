import java.util.Scanner;

public class PerfectPowerOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        boolean cheack = false;
        for (int i = 0; i < n; i++) {
            if (i * i == 0) {
                System.out.println(i);
                cheack = true;
                break;
            }
        }
        

    }

}
