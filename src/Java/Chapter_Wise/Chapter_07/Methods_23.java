package Java.Chapter_Wise.Chapter_07;

import java.util.Scanner;

public class Methods_23 {
    // Method overloading.
    // static int setCalculator(int x, int y, int z) {
    // int c = 0;
    // c = x + y + z;
    // return c;
    // }

    // static int setCalculator(int x, int y) {
    // int z = 0;
    // z = x + y;
    // return z;
    // }

    // static void changeArr(int[] arr, int x) {
    // for (int i = 0; i < x; i++) {
    // arr[i] = arr[i] * 2;
    // }
    // }

    // static void printArr(int[] arr) {
    // for (int rune : arr) {
    // System.out.print(rune + " ");
    // }
    // }

    // static void meth() {
    // System.out.println("This is a void return type method.");
    // }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Method invocation using object creation.
        // Methods_23 object = new Methods_23();
        // System.out.print("Enter two numbers to get their setCalculator: ");
        // int a = scan.nextInt(), b = scan.nextInt();
        // System.out.println("The setCalculator of " + a + " & " + b + " is: " + object.setCalculator(a,
        // b));

        // Method invocation without object creation.
        // System.out.print("Enter two numbers to get their setCalculator: ");
        // int a = scan.nextInt(), b = scan.nextInt();
        // System.out.println("The setCalculator of " + a + " & " + b + " is: " + setCalculator(a, b));

        // Void return type
        // meth();

        // Printing the whole array using void type method.
        // int[] array = { 23, 67, 54, 56, 4, 87, 34, 90, 864, 89, 40 };
        // printArr(array);
        // for (int run : array) {
        // System.out.print(run + " ");
        // }

        // Changing the first element of array using void type method.
        // int c = array.length;
        // System.out.println("Array before changing:->");
        // printArr(array);
        // for (int rune : array) {
        // System.out.print(rune + " ");
        // }
        // System.out.println();

        // System.out.println("Array after changing:->");
        // changeArr(array, c);
        // for (int run : array) {
        // System.out.print(run + " ");
        // }

        // // Method overloading.
        // System.out.println(setCalculator(4, 7));
        // System.out.println(setCalculator(2, 5, 9));

        scan.close();
    }
}
