import java.util.Scanner;

public class Count_Vowel {
        public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String: ");
        StringMethods s = sc.nextLine();
        int a=0,e=0,i=0,o=0,u=0;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a') {
                a++;
            } else if (s.charAt(j) == 'e') {
                e++;
            } else if (s.charAt(j) == 'i') {
                i++;
            }
             else if (s.charAt(j) == 'o') {
                o++;
            }
             else if (s.charAt(j) == 'u') {
                u++;
            }
        }

        System.out.println("a= " + a);
        System.out.println("e= " + e);
        System.out.println("i= " + i);
        System.out.println("o= " + o);
        System.out.println("u= " + u);
        }
}
