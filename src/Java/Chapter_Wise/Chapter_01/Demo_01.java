package Java.Chapter_Wise.Chapter_01;

import java.util.Scanner;

public class Demo_01 {
    public static void main(String[] args) {
        System.out.print("\n\nEnter your name: ");
        Scanner name = new Scanner(System.in);
        String naam = name.nextLine();
        System.out.print("Select bhai/bahen(type): ");
        String gen = name.nextLine();
        System.out.println("Oye sun " + naam + ", thanks a lot " + gen + " yaar!");

        name.close();
    }
}