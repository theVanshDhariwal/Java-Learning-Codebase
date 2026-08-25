package Java.Chapter_Wise.Chapter_09;

import java.util.Scanner;

class MyEmployee2 {
    private int id;
    private String name;
    private int salary;

    public MyEmployee2() {// Constructor
        name = "Not Initialised";
        id = 0;
    }

    public MyEmployee2(String n, int i) {// Constructor overloading
        name = n;
        id = i;
    }

    public MyEmployee2(String n) {// Constructor overloading
        name = n;
    }

    public MyEmployee2(int i) {// Constructor overloading
        id = i;
    }

    public void SetId(int x) {
        id = x;
    }

    public void SetName(String x) {
        name = x;
    }

    public int GetId() {
        return id;
    }

    public String GetName() {
        return name;
    }

    public MyEmployee2(String na, int n, int s) {// Constructor
        name = na;
        id = n;
        salary = s;
    }

    public int GetSalary() {
        return salary;
    }

}

public class Constructors_30 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        MyEmployee2 vansh = new MyEmployee2("Vansh Dhariwal", 45);
        MyEmployee2 harshit = new MyEmployee2("Harshit Tomar");
        MyEmployee2 waseem = new MyEmployee2(34);
        MyEmployee2 sanjeev = new MyEmployee2();

        System.out.println();
        System.out.println(vansh.GetName() + "'s id is: " + vansh.GetId());
        System.out.println(harshit.GetName() + "'s id is: " + harshit.GetId());
        System.out.println(waseem.GetName() + "'s id is: " + waseem.GetId());
        System.out.println(sanjeev.GetName() + "'s id is: " + sanjeev.GetId());

        // Quick Quiz :-->
        System.out.print("Enter the name of employee: ");
        String name = scan.nextLine();
        System.out.print("Enter the jarsy no. of employee: ");
        int id = scan.nextInt();
        System.out.print("Enter the salary of employee(in CPA): ");
        int salary = scan.nextInt();
        MyEmployee2 kohli = new MyEmployee2(name, id, salary);
        System.out.println(
                kohli.GetName() + "'s jarsy no. is: " + kohli.GetId() + " and salary is: " + kohli.GetSalary() + "CPA");
        scan.close();
    }
}