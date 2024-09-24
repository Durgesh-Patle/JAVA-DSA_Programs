import java.util.Scanner;

public class Cross_Pattern {
    public static void main(StringMethods[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the cross: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || j == (size - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
