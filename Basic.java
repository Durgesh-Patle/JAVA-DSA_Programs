public class Basic {
    public static void main(String[] args) {
        // anonysoms Inner Class
        new Object() {
            void anotherClass() {
                // System.out.println("Hello World!!");
                System.out.println("This is another method inside an anonysoms inner Class.");
            }
        }.anotherClass();
    }
}