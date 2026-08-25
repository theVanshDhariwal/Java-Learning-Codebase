package Java.Chapter_Wise.Chapter_09;

import java.util.Scanner;

class Cylinder {
    // 1. :-->
    private int height;
    private int radius;

    public void SetAttributes(int h, int r) {
        height = h;
        radius = r;
    }

    public int GetHeight() {
        return height;
    }

    public int GetRadius() {
        return radius;
    }

    // 2. :-->
    public double SurfaceArea() {
        return 2 * 3.14 * radius * (radius + height);
    }

    public double Volume() {
        return 3.14 * radius * radius * height;
    }

    // 3. :-->
    public Cylinder() {
        height = 5;
        radius = 7;
    }

    // 4. :-->
    public Cylinder(int l, int b) {
        height = l;
        radius = b;
    }

    public int Area() {
        return height * radius;
    }
}

class Sphere {
    private int radius;

    public void SetRadius(int r) {
        radius = r;
    }

    public int GetRadius() {
        return radius;
    }
}

public class PS_32 {
    public static void main(String[] args) {
        // 1. :-->
        // Cylinder cyli = new Cylinder();
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the height and radius of the cylinder: ");
        // cyli.SetAttributes(scan.nextInt(), scan.nextInt());
        // System.out.println("H = " + cyli.GetHeight() + " R = " + cyli.GetRadius());
        // scan.close();

        // 2. :-->
        // System.out.println("The surface area of the cylinder: " + cyli.SurfaceArea()
        // + "² unit");
        // System.out.println("The volume of the cylinder: " + cyli.Volume() + "³
        // unit");

        // 3. :-->
        // System.out.println("H = " + cyli.GetHeight() + " R = " + cyli.GetRadius());
        // System.out.println("The surface area of the cylinder: " + cyli.SurfaceArea()
        // + "² unit");
        // System.out.println("The volume of the cylinder: " + cyli.Volume() + "³
        // unit");

        // // 4. :-->
        // Scanner scan2 = new Scanner(System.in);
        // System.out.print("Enter the length and breadth of the cylinder: ");
        // Cylinder rectangle = new Cylinder(scan2.nextInt(), scan2.nextInt());
        // System.out.println("The area of the rectangle is: " + rectangle.Area() + "²
        // unit");
        // scan2.close();

        // 5. :-->
        Sphere sp = new Sphere();
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        sp.SetRadius(scan3.nextInt());
        System.out.println("R = " + sp.GetRadius() + " unit");
        scan3.close();
    }
}
