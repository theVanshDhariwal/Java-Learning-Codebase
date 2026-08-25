package Java.Concept_Wise.CoreJava.Abstraction;

import Java.Concept_Wise.CoreJava.Abstraction.Animal.Cow;
import Java.Concept_Wise.CoreJava.Abstraction.Animal.Human;
import Java.Concept_Wise.CoreJava.Abstraction.Animal.Lion;
import Java.Concept_Wise.CoreJava.Abstraction.Birds.Eagle;
import Java.Concept_Wise.CoreJava.Abstraction.Birds.Pigeon;

public class Test {
    public static void main(String[] args) {
        Creatures human = new Human();
        Creatures lion = new Lion();
        Creatures cow = new Cow();
        Creatures pigeon = new Pigeon();
        Creatures eagle = new Eagle();

        System.out.println();
        human.className();
        human.name();
        human.sound();
        human.eat();

        System.out.println();
        lion.className();
        lion.name();
        lion.sound();
        lion.eat();

        System.out.println();
        cow.className();
        cow.name();
        cow.sound();
        cow.eat();

        System.out.println();
        pigeon.className();
        pigeon.name();
        pigeon.sound();
        pigeon.eat();

        System.out.println();
        eagle.className();
        eagle.name();
        eagle.sound();
        eagle.eat();
    }
}
