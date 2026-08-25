package Java.Concept_Wise.CoreJava.Inheritance;

public class Child extends Parent {
    public Child() {
        System.out.println("Child default constructor called.");
    }

    public Child(int age, String name) {
        super(age, name);
        System.out.println("Child parameterised constructor called.");
        System.out.println(name + "'s age is " + age);
    }
}