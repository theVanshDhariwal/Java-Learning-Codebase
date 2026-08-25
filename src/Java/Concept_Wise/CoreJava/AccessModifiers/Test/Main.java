package Java.Concept_Wise.CoreJava.AccessModifiers.Test;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.meth();
        singleton.age = 19;
        System.out.println("My age is: " + singleton.age);
    }
}
