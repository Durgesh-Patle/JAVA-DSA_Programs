import java.util.Scanner;

public class Counting_loop {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();

   // 1.
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println(" ");
        // }

//  Output .

 // 1
 // 1 2
 // 1 2 3
 // 1 2 3 4
 // 1 2 3 4 5


    // 2 .

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
//   Output.
// 1  
// 2 2  
// 3 3 3  
// 4 4 4 4  
// 5 5 5 5 5  


    }
}
