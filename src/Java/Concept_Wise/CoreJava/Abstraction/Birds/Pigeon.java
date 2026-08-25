package Java.Concept_Wise.CoreJava.Abstraction.Birds;

import Java.Concept_Wise.CoreJava.Abstraction.Creatures;

public class Pigeon extends Creatures {
    @Override
    public void name() {
        System.out.println("Mitthu");
    }

    @Override
    public void sound() {
        System.out.println("Cooing");
    }

    @Override
    public void eat() {
        System.out.println("Cereal");
    }

    @Override
    public void className() {
        System.out.println("Pigeon class called");
    }
}
