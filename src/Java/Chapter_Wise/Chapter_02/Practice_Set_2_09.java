package Java.Chapter_Wise.Chapter_02;

import java.util.Scanner;

public class Practice_Set_2_09 {
    public static void main(String[] args) {
        // 1. :-->
        float A = 7 / 4 * 9 / 2;
        System.out.println(A);// The answer is 4.

        // 2. :-->
        char grade = 'B';
        // Encrypting the grade.
        grade = (char) (grade + 8);
        System.out.println(grade);
        // Decrypting the grade.
        grade = (char) (grade - 8);
        System.out.println(grade);

        // 3. :-->
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int B = sc.nextInt();
        System.out.println(B > 14);
        sc.close();

        // 4. :-->
        float v = 6f, u = 4f, a = 2f, s = 3f;
        float V = (v * v - u * u) / (2 * a * s);
        System.out.println(V);

        // 5. :-->
        System.out.println(7 * 49 / 7 + 35 / 7);
    }
}
