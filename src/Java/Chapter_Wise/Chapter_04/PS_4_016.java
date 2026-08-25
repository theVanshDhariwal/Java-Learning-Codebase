package Java.Chapter_Wise.Chapter_04;

import java.util.Scanner;

public class PS_4_016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. :-->
        // int a = 10;
        // if (a = 11) { // shows error because the within the if condition there are
        // //only relational operators allowed.
        // System.out.println("I am 11.");
        // } else {
        // System.out.println("I am not 11.");
        // }

        // 2. :-->

        // System.out.print("Enter 1st subject marks(out of 100): ");
        // int s1 = scan.nextInt();
        // System.out.print("Enter 2nd subject marks(out of 100): ");
        // int s2 = scan.nextInt();
        // System.out.print("Enter 3rd subject marks(out of 100): ");
        // int s3 = scan.nextInt();
        // float total = (s1 + s2 + s3) / 3f;
        // if (s1 < 33 || s2 < 33 || s3 < 33) {
        // System.out.println("You are fail!");
        // } else if (total < 40) {
        // System.out.println("You are fail!");
        // } else {
        // System.out.println("You are pass!");
        // }

        // 3. :-->

        // Below 2.5L = 0% and (2.5-5.0)L = 5% and (5.0-10.0)L = 20% and above 10.0L =
        // 30%

        // System.out.print("Enter your name: ");
        // String name = scan.nextLine();
        // System.out.print("Enter your income in lakhs(L): ");
        // float income = scan.nextFloat();
        // System.out.println("Your income is: " + income + "Lakhs Rs");

        // float tax = 0f;

        // if (income <= 2.5f) {
        // tax = 0f;
        // } else if (income > 2.5f && income <= 5.0f) {
        // tax = tax + 0.05f * (income - 2.5f);
        // } else if (income > 5.0f && income <= 10.0f) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (income - 5f);
        // } else if (income > 10.0f) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (10.0f - 5f);
        // tax = tax + 0.3f * (income - 10.0f);
        // }
        // System.out.printf("Your total tax paid by the " + name + " is: " + tax + "
        // Lakhs Rs.\n\n");

        // 4. :-->

        // System.out.print("Enter a number(1-7): ");
        // int num = scan.nextInt();
        // switch (num) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Tursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("You entered an invalid number.");
        // break;
        // }

        // 5. :-->

        // System.out.print("Enter a year: ");
        // int year = scan.nextInt();

        // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        // System.out.println(year + " is a leap year.");
        // } else {
        // System.out.println(year + " is not a leap year.");
        // }

        // 6. :-->

        System.out.print("Enter your website type: ");
        String web = scan.nextLine().trim();

        if (web.endsWith(".com")) {
            System.out.println(web + " is a comertial website.");
        } else if (web.endsWith(".org")) {
            System.out.println(web + " is a organizational website.");
        } else if (web.endsWith(".in")) {
            System.out.println(web + " is a indian website.");
        } else if (web.endsWith(".gov")) {
            System.out.println(web + " is a govenment website.");
        }

        scan.close();
    }
}
