package Java.Concept_Wise.CoreJava.AccessModifiers.Zoo;

public class Dog extends Animal {

    public Dog(String name) {
        super(name, "Bark");
    }

    public void wagTail() {
        System.out.println(getName() + " wagging its tail.");
    }

    public String getName() {
        return getClass().getSimpleName();
    }

    public void setDogSound(String newSound) {
        changeSoound(newSound);
    }
}
