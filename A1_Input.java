import java.util.Scanner;

public class A1_Input {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner1.next(); // Ali
        // String name =  "Ali";
        System.out.println("Your name is: " + name);

        System.out.print("Enter your age: ");
        int age = scanner1.nextInt(); //20
        // int age = 20;
        System.out.println("Your age is: " + age); // 5 -> "5"

    }

}
