package Java.Concept_Wise.CoreJava.Interfaces.Animals;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping.");
    }
}