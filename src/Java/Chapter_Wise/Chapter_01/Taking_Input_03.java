package Java.Chapter_Wise.Chapter_01;

import java.util.Scanner;

public class Taking_Input_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        Scanner scans = new Scanner(System.in);

        System.out.print("Enter the value of  integer A: ");
        int A = scan.nextInt();
        System.out.print("The value of A is: ");
        System.out.println(A);

        System.out.print("Enter the value of integer B: ");
        int B = scan.nextInt();
        System.out.print("The value of B is: ");
        System.out.println(B);

        int sum1 = A + B;
        System.out.print("The sum of A & B is: ");
        System.out.println(sum1);

        System.out.print("Enter the value of float C: ");
        float C = scan.nextFloat();
        System.out.print("The value of C is: ");
        System.out.println(C);

        System.out.print("Enter the value of float D: ");
        float D = scan.nextFloat();
        System.out.print("The value of D is: ");
        System.out.println(D);

        float sum2 = C + D;
        System.out.print("The setCalculator of C & D is: ");
        System.out.println(sum2);

        System.out.print("Enter any value to check it is integer or not: ");
        boolean int_B = scan.hasNextInt();
        System.out.println(int_B);

        System.out.print("Enter any value to check it is float or not: ");
        boolean float_B = sc.hasNextFloat();
        System.out.println(float_B);

        System.out.print("Enter a string: ");
        String str_1 = sca.next();
        System.out.println(str_1);

        System.out.print("Enter a string: ");
        String str_2 = scans.nextLine();
        System.out.println(str_2);

        scan.close();
        sc.close();
        sca.close();
        scans.close();
    }
}
