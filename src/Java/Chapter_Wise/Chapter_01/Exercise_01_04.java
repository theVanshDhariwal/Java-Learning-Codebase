package Java.Chapter_Wise.Chapter_01;


import java.util.Scanner;

public class Exercise_01_04 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner subjects = new Scanner(System.in);
        Scanner marks = new Scanner(System.in);

        System.out.println("\n");

        System.out.print("Enter your name: ");
        String student = name.nextLine();

        System.out.print("Enter your 1st subject name and marks: ");
        String S1 = subjects.nextLine();
        float M1 = marks.nextFloat();

        System.out.print("Enter your 2nd subject name and marks: ");
        String S2 = subjects.nextLine();
        float M2 = marks.nextFloat();

        System.out.print("Enter your 3rd subject name and marks: ");
        String S3 = subjects.nextLine();
        float M3 = marks.nextFloat();

        System.out.print("Enter your 4th subject name and marks: ");
        String S4 = subjects.nextLine();
        float M4 = marks.nextFloat();

        System.out.print("Enter your 5th subject name and marks: ");
        String S5 = subjects.nextLine();
        float M5 = marks.nextFloat();

        float sum = M1 + M2 + M3 + M4 + M5;
        float avg = sum / 5;

        System.out.print("Your name: ");
        System.out.println(student);

        System.out.print("Marks of ");
        System.out.print(S1);
        System.out.print(" is: ");
        System.out.println(M1);

        System.out.print("Marks of ");
        System.out.print(S2);
        System.out.print(" is: ");
        System.out.println(M2);

        System.out.print("Marks of ");
        System.out.print(S3);
        System.out.print(" is: ");
        System.out.println(M3);

        System.out.print("Marks of ");
        System.out.print(S4);
        System.out.print(" is: ");
        System.out.println(M4);

        System.out.print("Marks of ");
        System.out.print(S5);
        System.out.print(" is: ");
        System.out.println(M5);

        System.out.print("The total of all 5 subjects is: ");
        System.out.println(sum);

        System.out.print("You got ");
        System.out.print(avg);
        System.out.println("% ");
        System.out.print("percentage marks.");
        System.out.println("\nThank You sir/madam!\n");

        name.close();
        subjects.close();
        marks.close();
    }
}