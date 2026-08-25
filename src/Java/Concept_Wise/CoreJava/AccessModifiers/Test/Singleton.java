package Java.Concept_Wise.CoreJava.AccessModifiers.Test;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int age;

    public void meth() {
        System.out.println("Hello from Singleton.");
    }

}
