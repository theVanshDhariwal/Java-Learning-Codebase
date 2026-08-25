package Java.Concept_Wise.CoreJava.polymorphism.RunTime;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void methodCalled() {
        System.out.println("Dog method called.");
    }
}