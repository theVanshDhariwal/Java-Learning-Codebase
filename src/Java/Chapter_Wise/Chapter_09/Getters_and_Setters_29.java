package Java.Chapter_Wise.Chapter_09;

import java.util.Scanner;

class MyEmployee {
    private int id;
    private String name;

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
}

public class Getters_and_Setters_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyEmployee vansh = new MyEmployee();

        System.out.print("Enter the name of employee: ");
        vansh.SetName(scan.nextLine());
        System.out.print("Enter the ID of employee: ");
        vansh.SetId(scan.nextInt());
        System.out.println("The name of employee is: " + vansh.GetName());
        System.out.println("The name of id is: " + vansh.GetId());
        scan.close();
    }
}
