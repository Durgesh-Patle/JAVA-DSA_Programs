import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int d=(int)Math.floor(Math.random()*10)+10;
        
        System.out.println(d);
        while (true) {
            System.out.print("Enter Number: ");
            double n=sc.nextInt();
            if(n==d){
                System.out.println("Guessed");
                break;
            }
            else{
                System.out.println("try Again");
            }
            
        }
    }
}
