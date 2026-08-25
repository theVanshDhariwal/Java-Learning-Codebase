package Java.Chapter_Wise.Chapter_13;

class VanshClass extends Thread {
    public VanshClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello My name is Vansh Dhariwal.");
    }
}

public class ConstructorFromThreadClass {
    public static void main(String[] args) {
        VanshClass vanshClass1 = new VanshClass("Vansh");
        VanshClass vanshClass2 = new VanshClass("Dhariwal");

        vanshClass1.start();
        System.out.println("The id of the thread vanshClass1 is: " + vanshClass1.getId());
        System.out.println("The id of the thread vanshClass1 is: " + vanshClass1.getName());

        vanshClass2.start();
        System.out.println("The id of the Thread vanshClass2 is: " + vanshClass2.getId());
        System.out.println("The id of the Thread vanshClass2 is: " + vanshClass2.getName());
    }
}