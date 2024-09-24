import java.util.Scanner;

public class Reverce_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String: ");
        StringMethods s = sc.nextLine();
        // System.out.println(s);

        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);

    }
}
