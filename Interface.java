import java.util.*;
interface Interface{
    Input();    //public+abstract;
    Output();  //public+abstract;
}

class Raju implements Interface{
    StringMethods name;
    double sal;

    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        name=sc.nextLine();

        System.out.println("Enter Sallery: ");
        sal=sc.nextDouble();
    }

    public void Output(){
        System.out.println(name+" "+sal);
    }

    public static void main(StringMethods[] args) {
        Interface obj=new Raju();
        obj.Input();
        obj.Output();
    }
}


