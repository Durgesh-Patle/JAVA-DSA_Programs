import java.util.Scanner;

public class Palendrome_String {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String: ");
        String s = sc.nextLine();

        boolean cheack =false;

        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }

        System.out.println(rev);

        // if(s==rev){
        //     System.out.println("Palendrome String.");
        // }
        // else{
        //     System.out.println("Not Palendrome String.");
        // }


        // for(int j=0;j<s.length();j++){
        //     if(s.charAt(j)!=rev.charAt(j)){
        //         cheack=true;
        //         break;
        //     }
        // }
        // if(cheack==true){
        //     System.out.println("Not Palendrome String");
        // }
        // else{
        //     System.out.println("Palendrome String");
        // }


//      String Builder.

        if(s.equals(rev)){
            System.out.println("Palin");
        }
        else{
            System.out.println("Not Palin");
        }
    }
}
