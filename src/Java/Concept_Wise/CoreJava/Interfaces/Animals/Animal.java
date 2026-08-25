package Java.Concept_Wise.CoreJava.Interfaces.Animals;

public interface Animal {

    //    public static int maxAge = 150;   This is similar to below one.
    int maxAge = 150;

    void eat();

    void sleep();

//    Either add it to the Dog and Cat or remove it.
//    abstract void hello();

    static void info() {
        System.out.println("This is an Animal Interface.");
    }

    default void run(int a, int b) {
        this.eat();
        this.sleep();
        System.out.println("Animal is running.");
        System.out.println("The sum is: " + (a + b));

    }
}