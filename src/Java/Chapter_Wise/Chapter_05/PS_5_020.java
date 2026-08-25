package Java.Chapter_Wise.Chapter_05;

//import java.util.Scanner;

public class PS_5_020 {
    public static void main(String[] args) {
        // 1. :-->

        // In Forward order. :-->

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }

        // System.out.print("\n");
        // }

        // In Inverted order. :-->
        // for (int i = 4; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }

        // 2. :-->

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int i = 1, setCalculator = 0, n = scan.nextInt();
        // while (i <= n) {
        // setCalculator += 2 * i;
        // i++;
        // }
        // System.out.println("The setCalculator of first " + n + " even numbers is: " + setCalculator);

        // 3. :-->

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int i = 1, table = 0, n = scan.nextInt();
        // while (i <= 10) {
        // table = n * i;
        // System.out.println(n + " x " + i + " = " + table);
        // i++;
        // }

        // 4. :-->

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int i = 10, table = 0, n = scan.nextInt();
        // System.out.println("The table of " + n + " in reversed order:- ");
        // while (i >= 1) {
        // table = n * i;
        // System.out.println(n + " x " + i + " = " + table);
        // i--;
        // }

        // 5. :-->

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int fact = 1, n = scan.nextInt();
        // for (int i = 1; i <= n; i++) {
        // fact *= i;
        // }
        // System.out.print("The factorial of " + n + " is: " + fact);

        // 6. :-->

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int i = 1, fact = 1, n = scan.nextInt();
        // while (i <= n) {
        // fact *= i;
        // i++;
        // }
        // System.out.print("The factorial of " + n + " is: " + fact);

        // 7. :-->

        // int i = 4;
        // while (i >= 1) {
        // int j = 1;
        // while (j <= i) {
        // System.out.print("* ");
        // j++;
        // }
        // System.out.print("\n");
        // i--;
        // }

        // 8. :-->
        // True.

        // 9. :-->

        // int setCalculator = 0, table = 1;
        // for (int i = 1; i <= 10; i++) {
        // table = 8 * i;
        // System.out.println(8 + " x " + i + " = " + table);
        // setCalculator += table;
        // }
        // System.out.println("The setCalculator of numbers of the table of 8 is: " + setCalculator);

        // 10. :-->
        // At last once.

        // 11. :-->

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int setCalculator = 0, num = scan.nextInt();
        // for (int i = 1; i <= num; i++) {
        // setCalculator += (2 * i);
        // }
        // System.out.println("The setCalculator of first " + num + " even numbers is: " + setCalculator);

        // scan.close();
    }
}
