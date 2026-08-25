package Java.Chapter_Wise.Chapter_06;

import java.util.Scanner;

public class Arrays_021 {
    public static void main(String[] args) {
        // Thee are 3 ways to create an array in java.

        // 1. :-->

        // String[] strings = new String[5];

        // 2. :-->

        // char[] characters;
        // characters = new char[5];

        // 3. :-->
        // int[] integers = new int[5];

        // Taking user input into an array.

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the size of array: ");
        // int n = scan.nextInt();
        // int[] array = new int[n];
        // System.out.println("Enter " + n + " integers: ");
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter " + (i + 1) + " element: ");
        // array[i] = scan.nextInt();
        // }
        // System.out.println("The length of your array is: " + array.length);
        // System.out.println("Now your elements are:----->>>");

        // for (int i = 0; i < n; i++) {
        // System.out.println("Your element " + i + " is: " + array[i]);
        // }

        // Displaying array using for-each loop.

        // int[] arr = { 23, 56, 34, 66, 8 };
        // for (int element : arr) {
        // System.out.println(element);
        // }

        // Multidimensional array. :-->

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the 2-D array: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[][] int_arr = new int[a][b];
        System.out.println("Enter the elements in " + a + "x" + b + " format: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int_arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Your array elements are: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(int_arr[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
