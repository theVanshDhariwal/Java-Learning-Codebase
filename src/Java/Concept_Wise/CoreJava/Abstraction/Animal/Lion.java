package Java.Concept_Wise.CoreJava.Abstraction.Animal;

import Java.Concept_Wise.CoreJava.Abstraction.Creatures;

public class Lion extends Creatures {
    @Override
    public void name() {
        System.out.println("Romeo");
    }

    @Override
    public void sound() {
        System.out.println("Roar...");
    }

    @Override
    public void eat() {
        System.out.println("Fresh meat");
    }

    @Override
    public void className() {
        System.out.println("Lion class called");
    }
}
