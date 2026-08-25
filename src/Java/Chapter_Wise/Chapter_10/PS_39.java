package Java.Chapter_Wise.Chapter_10;

//1. :-->
class Circle {
    int radius;

    Circle(int r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder2 extends Circle {
    int height;

    Cylinder2(int r, int h) {
        super(r);
        height = h;
    }

    public double volume() {
        return area() * height;
    }
}

// 2. :-->
class Rectangle {
    int length, breadth;

    public void setLength(int l) {
        length = l;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getArea() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle {
    private int height;

    public void setHeigth(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return getArea() * height;
    }
}

public class PS_39 {
    public static void main(String[] args) {
        // 3. :-->
        Cylinder2 cyl = new Cylinder2(4, 7);
        System.out.println(cyl.area());
        System.out.println(cyl.volume());

        // 4. :-->
        Cuboid cub = new Cuboid();
        cub.setBreadth(4);
        cub.setLength(5);
        System.out.println(cub.getArea());
        System.out.println();
        cub.setHeigth(6);
        System.out.println(cub.getVolume());
    }
}
