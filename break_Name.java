import java.util.Scanner;

public class break_Name {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        StringMethods s = sc.nextLine();

        System.out.println(s.length());

        // System.out.println(s);

        // String str2="";
        // str2+='a';
        // System.out.println(str2);
        // str2="";
        // str2+='b';
        // System.out.println(str2);

        StringMethods str2 = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(str2);
                str2 = "";
            } else {
                str2 += s.charAt(i);
            }
        }
        System.out.println(str2);

    }

}
