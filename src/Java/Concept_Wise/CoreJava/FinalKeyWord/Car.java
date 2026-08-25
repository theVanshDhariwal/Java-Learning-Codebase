package Java.Concept_Wise.CoreJava.FinalKeyWord;

public class Car {

    //    Can't be changed.
    private final int maxSpeed = 240;
    private final int minSpeed;


    public Car() {
        minSpeed = 20;
    }

    //    Can't be  overridden
    public final void airBages() {
        System.out.println("4 air bages.");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}