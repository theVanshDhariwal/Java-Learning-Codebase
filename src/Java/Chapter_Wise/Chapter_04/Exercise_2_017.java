package Java.Chapter_Wise.Chapter_04;

import java.util.Scanner;
import java.util.Random;

public class Exercise_2_017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int com = random.nextInt(3);

        System.out.println("THIS IS ROCK PAPER SCISSORS GAME.\n");
        System.out.print("Enter a number(0 for ROCK || 1 for PAPER || 2 for SCISSORS.): ");
        int num = scan.nextInt();

        String user_move = "Not initialized.";
        String com_move = "Not initialized";

        if (num == 0) {
            user_move = "ROCK";
        } else if (num == 1) {
            user_move = "PAPER";
        } else if (num == 2) {
            user_move = "SCISSORS";
        }

        if (com == 0) {
            com_move = "ROCK";
        } else if (com == 1) {
            com_move = "PAPER";
        } else if (com == 2) {
            com_move = "SCISSORS";
        }

        System.out.println("Your move --> " + user_move);
        System.out.println("Computer's move --> " + com_move);

        if (user_move.equals(com_move)) {
            System.out.println("It's a DRAW.");
        } else if ((user_move.equals("ROCK") && com_move.equals("PAPER"))
                || (user_move.equals("PAPER") && com_move.equals("SCISSORS"))
                || (user_move.equals("SCISSORS") && com_move.equals("ROCK"))) {
            System.out.println("Computer won!");
        } else if (user_move.equals("PAPER") || user_move.equals("SCISSORS") || user_move.equals("ROCK")) {
            System.out.println("You won!");
        } else {
            System.out.println("Invalid choice!");
        }
        System.out.println("Thanks for playing the game.");

        scan.close();
    }
}
