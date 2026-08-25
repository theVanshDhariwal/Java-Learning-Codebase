package Java.Concept_Wise.CoreJava.Abstraction.Animal;

import Java.Concept_Wise.CoreJava.Abstraction.Creatures;

public class Cow extends Creatures {
    @Override
    public void name() {
        System.out.println("Kallo");
    }

    @Override
    public void sound() {
        System.out.println("Moo...");
    }

    @Override
    public void eat() {
        System.out.println("Grass");
    }

    @Override
    public void className() {
        System.out.println("Cow class called");
    }
}