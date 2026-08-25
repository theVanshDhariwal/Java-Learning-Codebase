package Java.Chapter_Wise.Chapter_09;

import java.util.Scanner;
import java.util.Random;

class Game {
    int n;
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int com, num, count = 0;

    public Game() {
        com = random.nextInt(100);
    }

    public void TakeUserInput() {
        System.out.print("Enter a number : ");
        num = scan.nextInt();
    }

    public void IsCorrectNumber() {
        while (num != com) {
            TakeUserInput();
            if (num == com) {
                System.out.println("CORRECT.....");
            } else if (num > com) {
                System.out.println("Your number is greater then original number.");
            } else if (num < com) {
                System.out.println("Your number is smaller then original number.");
            }
            count++;
        }
        System.out.println("You guess the number in " + count + " tries.");
        scan.close();
    }
}

public class Exercise_03_31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game gtn = new Game();
        System.out.println("Let's play GUESS THE NUMBER game.");
        System.out.println("Enter the number in the RANGE of(0-100)");
        gtn.IsCorrectNumber();
        scan.close();
    }
}
