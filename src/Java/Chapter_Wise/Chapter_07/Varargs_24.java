package Java.Chapter_Wise.Chapter_07;

import java.util.Scanner;

public class Varargs_24 {

    static int sum(int... args) {
        int result = 0;
        for (int a : args) {
            result += a;
        }

        return result;
    }

    public static void main(String[] args) {
        // System.out.println("The setCalculator of 2, 56, 78 and 4 is: " + setCalculator(2, 4, 56, 78));

        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The setCalculator is: " + sum(arr));

        scan.close();
    }
}
