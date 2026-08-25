package Java.Concept_Wise.CoreJava.Interfaces.Test;

import Java.Concept_Wise.CoreJava.Interfaces.Animals.Animal;
import Java.Concept_Wise.CoreJava.Interfaces.Animals.Cat;
import Java.Concept_Wise.CoreJava.Interfaces.Animals.Dog;

public class Jungle {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.sleep();
        cat.eat();
        cat.sleep();

        System.out.println(Dog.maxAge);
        System.out.println(Animal.maxAge);

        Animal.info();
        dog.run(4, 5);
        cat.run(34, 56);
    }
}