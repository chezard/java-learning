import java.util.Scanner;

public class A2_IfElse {

    public static void main(String[] args) {

        //syntax
        // > < == >= <= != --> operators
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); //30


        ///////////////// 1 //////////////////

//        if (age > 20) {
//            System.out.println("Your age is greater than 20");
//        }
//        else {
//            System.out.println("Your age is not greater than 20");
//        }


        ///////////////// 2 //////////////////

//        if (age > 20) {
//            System.out.println("Your age is greater than 20");
//        }
//        else if (age == 20) {
//            System.out.println("Your age is 20");
//        }
//        else {
//            System.out.println("Your age is not greater than 20");
//        }


        ///////////////// 3 //////////////////

        boolean isGreaterThan20 = age > 20;
        // boolean isGreaterThan20 = true;

        if (isGreaterThan20) {
            System.out.println("Your age is greater than 20");
        }


        if (age < 20) {
            System.out.println("Your age is not greater than 20");
        }
        else {
            System.out.println("Your age is 20");
        }


        // else özünün üstündə olan ən yaxın if-ə aiddir.

//        if (age > 20) {
//            System.out.println("You are young");
//            System.out.println("You are young");
//            System.out.println("You are young");
//            System.out.println("You are young");
//        }
//
//        // Condition 'age > 60' is always 'false'
//        else if (age > 60) {
//            System.out.println("You are old");
//            System.out.println("You are old");
//            System.out.println("You are old");
//            System.out.println("You are old");
//        } else {
//            System.out.println("You are teenager");
//            System.out.println("You are teenager");
//            System.out.println("You are teenager");
//            System.out.println("You are teenager");
//        }

    }

}
