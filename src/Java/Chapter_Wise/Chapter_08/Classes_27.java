package Java.Chapter_Wise.Chapter_08;

import java.util.Scanner;

class Employee1 {
    int id, salary;
    String name;

    public void printDetails() {
        System.out.println("My ID is: " + id + ",");
        System.out.println("my name is: " + name);
    }

    public void getSalary() {
        System.out.println("and my salary is: " + salary + "K");
    }
}

public class Classes_27 {
    public static void main(String[] args) {
        System.out.println("This is my custom class.");

        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        // Instantiation the employees(creating the Object.)
        Employee1 vansh = new Employee1();
        Employee1 vishakha = new Employee1();

        // Setting Attributes for employees.
        System.out.print("Enter the ID of Vansh: ");
        vansh.id = scan.nextInt();
        System.out.print("Enter the full name of Vansh: ");
        vansh.name = sc.nextLine();
        System.out.print("Enter the salary of Vansh: ");
        vansh.salary = scan.nextInt();
        System.out.print("Enter the ID of Vishakha: ");
        vishakha.id = scan.nextInt();
        System.out.print("Enter the full name of Vishakha: ");
        vishakha.name = sc.nextLine();
        System.out.print("Enter the salary of Vishakha: ");
        vishakha.salary = scan.nextInt();

        // Printing Attributes for employees.
        vansh.printDetails();
        vansh.getSalary();
        vishakha.printDetails();
        vishakha.getSalary();

        scan.close();
        sc.close();
    }
}
