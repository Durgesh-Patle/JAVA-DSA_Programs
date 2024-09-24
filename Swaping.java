// package DSA _Basics;

public class Swaping {
    
    public static void main(String[] args) {
        int a=1,b=2,c=3;

        System.out.println("before A: "+a);
        System.out.println("before B: "+b);
        System.out.println("before C: "+c);

        int d=c;
        c=b;
        b=a;
        a=d;

        System.out.println("After A: "+a);
        System.out.println("After B: "+b);
        System.out.println("After C: "+c);

    }
}
