package Java.Concept_Wise.CoreJava.Generics.WildCardsInGenerics.UpperBound;

import java.util.List;

class Animal {
    public void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class AnimalDemo {
    public static void makeSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        makeSound(dogs);  // Valid
        makeSound(cats);  // Valid
    }
}