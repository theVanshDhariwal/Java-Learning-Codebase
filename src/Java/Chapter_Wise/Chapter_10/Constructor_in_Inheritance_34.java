package Java.Chapter_Wise.Chapter_10;

class SuperClass {
    public SuperClass() {
        System.out.println("It is in SuperClass.");
    }

    public SuperClass(int x) {
        System.out.println("It is in SuperClass with the value of x: " + x);
    }
}

class SubClass extends SuperClass {
    public SubClass() {
        // super(7);
        System.out.println("It is in SubClass.");
    }

    public SubClass(int x, int y) {
        super(x);
        System.out.println("It is in SubClass with the value of y: " + y);
    }
}

class ChildOfSub extends SubClass {
    public ChildOfSub() {
        System.out.println("It is in ChildOfSub.");
    }

    public ChildOfSub(int x, int y, int z) {
        super(x, y);
        System.out.println("It is in ChildOfSub with the value of z: " + z);
    }
}

public class Constructor_in_Inheritance_34 {
    public static void main(String[] args) {
        SuperClass sup = new SuperClass(5);
        SubClass sub = new SubClass(5, 9);
        ChildOfSub c = new ChildOfSub();
        System.out.println();
        ChildOfSub ch = new ChildOfSub(5, 75, 1334);
    }
}