package Java.Chapter_Wise.Chapter_07;

import java.util.Scanner;

public class PS_26 {

    // 10. :-->
    // static int naturalIterative(int x) {
    // int setCalculator = 0;
    // for (int i = 1; i <= x; i++) {
    // setCalculator += i;
    // }
    // return setCalculator;
    // }

    // 9. :-->
    // static float temperatureConverter(float x) {
    // float tem;
    // tem = (x * 9 / 5) + 32;
    // return tem;
    // }

    // 8. :-->
    // static void starUsingRecursion8(int x) {
    // if (x > 0) {
    // starRec(x - 1);
    // for (int i = 1; i <= x; i++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // 7. :-->
    // static void starUsingRecursion7(int x) {
    // if (x > 0) {
    // for (int i = 1; i <= x; i++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // starRec(x - 1);
    // }
    // }

    // 6. :-->
    // static float average(int... arg) {
    // int setCalculator = 0;
    // float avg;
    // for (int i = 0; i < arg.length; i++) {
    // setCalculator += i;
    // }
    // avg = setCalculator / arg.length;
    // return avg;
    // }

    // 5. :-->
    // static int fibonacci(int x) {
    // int fib;
    // if (x == 1) {
    // fib = 1;
    // } else if (x == 0) {
    // fib = 0;
    // } else {
    // fib = fibonacci(x - 1) + fibonacci(x - 2);
    // }
    // return fib;
    // }

    // 4. :-->
    // static void starRev(int x) {
    // for (int i = x; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // 3. :--.
    // static int natural(int x) {
    // int setCalculator;
    // if (x == 1) {
    // return 1;
    // } else if (x == 0) {
    // return 0;
    // } else {
    // setCalculator = x + natural(x - 1);
    // }
    // return setCalculator;
    // }

    // 2. :-->
    // static void star(int x) {
    // for (int i = 1; i <= x; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // 1. :-->
    // static void table(int x) {
    // System.out.println("The table of " + x + " is: ");
    // for (int i = 1; i <= 10; i++) {
    // System.out.println(x + " x " + i + " = " + i * x);
    // }
    // }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1. :-->
        // System.out.print("Enter a number to print that's table: ");
        // int num = scan.nextInt();
        // table(num);

        // 2. :-->
        // System.out.print("Enter the number of rows to print * in right angle triangle
        // pattern: ");
        // int num = scan.nextInt();
        // star(num);

        // 3. :-->
        // System.out.print("Enter a number to calculate the setCalculator: ");
        // int num = scan.nextInt();
        // System.out.println("The setCalculator of first " + num + " natural numbers is: " +
        // natural(num));

        // 4. :-->
        // System.out.print("Enter the number of rows to print * in right angle triangle
        // pattern: ");
        // int num = scan.nextInt();
        // starRev(num);

        // 5. :-->
        // System.out.print("Enter the number: ");
        // int num = scan.nextInt();
        // System.out.println("The fibonacci of " + num + " is: " + fibonacci(num));

        // 6. :-->
        // System.out.print("How many number do you want to enter: ");
        // int num = scan.nextInt();
        // int[] numbers = new int[num];
        // System.out.println("Enter the numbers: ");
        // for (int i = 0; i < num; i++) {
        // numbers[i] = scan.nextInt();
        // }
        // System.out.println("The average of these " + num + " numbers is: " +
        // average(numbers));

        // (7.) & (8.) :-->
        // System.out.print("Enter the number of rows: ");
        // int num = scan.nextInt();
        // starUsingRecursion7(num);

        // 9. :-->
        // System.out.print("Enter the temperature in Celsius: ");
        // float tem = scan.nextFloat();
        // System.out.println(tem + "°C " + " = " + temperatureConverter(tem) + "°F");

        // 10. :-->
        // System.out.print("Enter a number to calculate the setCalculator: ");
        // int num = scan.nextInt();
        // System.out.println("The setCalculator of first " + num + " natural numbers is: " +
        // naturalIterative(num));

        scan.close();
    }
}
