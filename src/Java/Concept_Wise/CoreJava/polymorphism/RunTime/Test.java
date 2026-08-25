package Java.Concept_Wise.CoreJava.polymorphism.RunTime;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.methodCalled();
        animal.makeSound();

        Animal dog = new Dog();
        dog.methodCalled();
        dog.makeSound();

        Animal cat = new Cat();
        cat.methodCalled();
        cat.makeSound();
    }
}
