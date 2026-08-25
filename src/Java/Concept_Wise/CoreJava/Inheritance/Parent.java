package Java.Concept_Wise.CoreJava.Inheritance;

public class Parent extends Grandparent {

    public Parent() {
        System.out.println("Parent default constructor called.");
    }

    public Parent(int age, String name) {
        super(age, name);
        System.out.println("parent parameterised constructor called.");
        super.setName("Jay");
        System.out.println(super.getName());
        System.out.println(name + "'s age is " + age);
    }
}