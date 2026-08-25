package Java.Concept_Wise.CoreJava.polymorphism.RunTime;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void methodCalled() {
        System.out.println("Cat method called.");
    }
}