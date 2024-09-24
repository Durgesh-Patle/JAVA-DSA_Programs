import java.util.Scanner;

public class PaswordCheack {
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);

        int pass=2784;
        
        while (true) {

            System.out.print("Enter Your Password: ");
            int upass=sc.nextInt();

            if(upass==pass){
                System.out.println("Currect Password.");
                System.out.println("Thank You.");
                break;
            }
            else{
                System.out.println("Incurrect Password.");
                System.out.println("Please try Again.");
            }
            
        }
    }
}
