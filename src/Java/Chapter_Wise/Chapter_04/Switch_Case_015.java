package Java.Chapter_Wise.Chapter_04;

import java.util.Scanner;

public class Switch_Case_015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter month name: ");
        String month = scan.nextLine().trim().toLowerCase();

        // Modern method(Enhanced switch case) :-->

        switch (month) {

            case "january" -> System.out.println("31 Days.");
            case "march" -> System.out.println("31 Days.");
            case "may" -> System.out.println("31 Days.");
            case "July" -> System.out.println("31 Days.");
            case "august" -> System.out.println("31 Days.");
            case "October" -> System.out.println("31 Days.");
            case "December" -> System.out.println("31 Days.");
            case "April" -> System.out.println("30 Days.");
            case "June" -> System.out.println("30 Days.");
            case "September" -> System.out.println("30 Days.");
            case "November" -> System.out.println("30 Days.");
            case "February" -> {
                System.out.println("is it a leep year(yes/no): ");
                String feb = scan.nextLine().trim().toLowerCase();
                if (feb.equals("yes")) {
                    System.out.println("29 Days.");
                } else if (feb.equals("no")) {
                    System.out.println("28 Days.");
                } else {
                    System.out.println("Enter only (yes/no).");
                }
            }
            default -> System.out.println("Enter a valid month name.");
        }

        /* switch (month) {
         case "january":
         case "march":
         case "may":
         case "july":
         case "august":
         case "october":
         case "december":
         System.out.println("31 Days.");
         break;
         case "april":
         case "june":
         case "september":
         case "november":
         System.out.println("30 Days.");
         break;
         case "february":
         System.out.println("is it a leap year(yes/no): ");
         String feb = scan.nextLine().trim().toLowerCase();
         if (feb.equals("yes")) {
         System.out.println("29 Days.");
         } else if (feb.equals("no")) {
         System.out.println("28 Days.");
         } else {
         System.out.println("Enter only (yes/no).");
         }
         default:
         System.out.println("Enter a valid month name.");
         }
         */
        scan.close();
    }
}
