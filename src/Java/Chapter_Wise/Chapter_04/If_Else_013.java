package Java.Chapter_Wise.Chapter_04;

import java.util.Scanner;

public class If_Else_013 {
    public static void main(String[] args) {
        /*
         * Scanner scan = new Scanner(System.in);
         * System.out.print("Enter your name: ");
         * String name = scan.nextLine();
         * System.out.print("Enter your age: ");
         * int age = scan.nextInt();
         * if (age >= 18) {
         * System.out.println("Yes " + name + " you can drive!");
         * System.out.println("Because your age is: " + age);
         * } else {
         * System.out.println("No " + name + " you can not drive!");
         * System.out.println("Because your age is: " + age);
         * }
         *
         *
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negetive number.");
        } else {
            System.out.println("You entered the zero.");
        }
        scan.close();
    }
}
