package Java.Chapter_Wise.Chapter_08;

import java.util.Scanner;

// 1. :-->
class Employee2 {
    int salary;

    public int getSalary() {
        return salary;
    }

    String name;

    public String getName() {

        return name;
    }

    public void setName(String naam) {
        name = naam;
    }
}

// 2. :-->
class CellPhone {
    public void ringing() {
        System.out.println("ringing...");
    }

    public void vibrating() {
        System.out.println("vibrating...");
    }

    public void calling(String x) {
        System.out.println("calling " + x + "...");
    }
}

// 3. :-->
class Square {
    float side;

    public float takeSide() {
        return side;
    }

    public float calculateArea() {
        return side * side;
    }

    public float calculateParameter() {
        return 2 * (side + side);
    }
}

// 3. :-->
class Rectangle {
    float length;
    float breadth;

    public float calculateArea() {
        return length * breadth;
    }

    public float calculateParameter() {
        return 2 * (length + breadth);
    }
}

// 5. :-->
class TommyVecetti {
    public void talking() {
        System.out.println("talking...");
    }

    public void hitting() {
        System.out.println("hitting...");
    }

    public void firing() {
        System.out.println("firing...");
    }

    public void running() {
        System.out.println("running...");
    }
}

// 6. :-->
class Circle {
    float radius;

    public double area() {
        return 3.14 * radius * radius;
    }

    public double parimeter() {
        return 2 * 3.14 * radius;
    }
}

public class PS_28 {
    public static void main(String[] args) {
        // 1. :-->
        // Employee2 vansh = new Employee2();
        // vansh.setName("Vansh Dhariwal");
        // vansh.salary = 200;
        // System.out.println("My name is: " + vansh.getName() + ",");
        // System.out.println("and my salary is: " + vansh.getSalary() + "K$");

        // 2. :-->
        // CellPhone vivo = new CellPhone();
        // vansh.setName("Vansh Dhariwal");
        // vivo.calling(vansh.getName());
        // vivo.vibrating();
        // vivo.ringing();

        // 3. :-->
        // Square sq = new Square();
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the side of square: ");
        // float sides = scan.nextFloat();
        // sq.side = sides;
        // sq.takeSide();
        // System.out.println("The area is: " + sq.calculateArea() + " square unit.");
        // System.out.println("The parameter is: " + sq.calculateParameter() + " cube
        // unit.");
        // scan.close();

        // 4. :-->
        // Rectangle rec = new Rectangle();
        // Scanner scan = new Scanner(System.in);
        // float length, breadth;
        // System.out.print("Enter the length of rectangle: ");
        // length = scan.nextFloat();
        // rec.length = length;
        // System.out.print("Enter the breadth of rectangle: ");
        // breadth = scan.nextFloat();
        // rec.breadth = breadth;
        // System.out.println("The area is: " + rec.calculateArea() + " square unit.");
        // System.out.println("The parameter is: " + rec.calculateParameter() + " cube
        // unit.");
        // scan.close();

        // 5. :-->
        // TommyVecetti tv = new TommyVecetti();
        // tv.talking();
        // tv.hitting();
        // tv.firing();
        // tv.running();

        // 6. :-->
        Circle ci = new Circle();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        ci.radius = scan.nextFloat();
        System.out.println(ci.area());
        System.out.println(ci.parimeter());
        scan.close();
    }
}
