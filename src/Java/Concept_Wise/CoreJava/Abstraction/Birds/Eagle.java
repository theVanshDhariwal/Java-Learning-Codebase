package Java.Concept_Wise.CoreJava.Abstraction.Birds;

import Java.Concept_Wise.CoreJava.Abstraction.Creatures;

public class Eagle extends Creatures {
    @Override
    public void name() {
        System.out.println("Miraj");
    }

    @Override
    public void sound() {
        System.out.println("Piping");
    }

    @Override
    public void eat() {
        System.out.println("small pieces of meat");
    }

    @Override
    public void className() {
        System.out.println("Eagle class called");
    }
}
