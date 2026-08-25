package Java.Chapter_Wise.Chapter_11;

abstract class Vehicle {
    int a = 7;

    abstract void startEngine();

    void stopEngine() {
        System.out.print("The engine has stopped!");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.print("Give a firm downward kick on the lever!");
    }
}

// abstract class Truck {
// void horn() {
// System.out.println("mein jatt yamla pagla dewana o rabba itni si batt na
// jana!");
// }
// }

class Car extends Vehicle {// class Car extends Vehicle, Truck --> can't do this

    void startEngine() {
        System.out.print("Insert the key into the ignition switch!");
    }
}

public class Abstract_40 {
    public static void main(String[] args) {
        // Vehicle vec = new Vehicle(); // --> Abstract class can't be instantiated
        Vehicle vecB = new Bike();
        Vehicle vecC = new Car();

        System.out.println();
        System.out.println("|-------------------------------------------------|");
        System.out.println("|_________________________________________________|");
        System.out.print("|    ");
        vecB.startEngine();
        System.out.println("      |");
        System.out.print("|    ");
        vecB.stopEngine();
        System.out.println("                      |");
        System.out.println("|-------------------------------------------------|");
        System.out.print("|    ");
        vecC.startEngine();
        System.out.println("     |");
        System.out.print("|    ");
        vecC.stopEngine();
        System.out.println("                      |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|_________________________________________________|");
        System.out.println();
        vecB.a = 4;
        System.out.println(vecB.a);
    }
}
