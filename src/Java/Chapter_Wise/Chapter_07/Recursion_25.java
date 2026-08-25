package Java.Chapter_Wise.Chapter_07;

import java.util.Scanner;

public class Recursion_25 {

    static int fibonacci(int x) {
        int fib;
        if (x == 1) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else {
            fib = fibonacci(x - 1) + fibonacci(x - 2);
        }
        return fib;
    }

    static int factorial(int x) {
        int fact;
        if (x == 0 || x == 1) {
            fact = 1;
        } else {
            fact = factorial(x - 1) * x;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to find that's factorial: ");
        int num = scan.nextInt();
        System.out.println("The factorial of " + num + " is: " + factorial(num));

        System.out.print("Enter a number to find that's fibonacci: ");
        int number = scan.nextInt();
        System.out.println("The fibonacci of " + num + " is: " + fibonacci(number));

        scan.close();
    }
}
