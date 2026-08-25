package Java.Concept_Wise.CoreJava.Abstraction.Animal;

import Java.Concept_Wise.CoreJava.Abstraction.Creatures;

public class Human extends Creatures {

    @Override
    public void name() {
        System.out.println("Vansh");
    }

    @Override
    public void sound() {
        System.out.println("Hello...");
    }

    @Override
    public void eat() {
        System.out.println("Anything");
    }

    @Override
    public void className() {
        System.out.println("Human class called");
    }
}
