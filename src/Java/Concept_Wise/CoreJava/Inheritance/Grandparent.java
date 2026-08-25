package Java.Concept_Wise.CoreJava.Inheritance;

public class Grandparent {

    private String name;
    private int age;
    private int height;
    private boolean hasSuperPowers;

    public Grandparent() {
        hasSuperPowers = true;
        System.out.println("Grandparent default constructor called.");
    }

    public Grandparent(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Grandparent parameterised constructor called.");
        System.out.println(name + "'s age is " + age);
    }

    public boolean hasSuperPowers() {
        return hasSuperPowers;
    }

    public String getName() {
        return name;
    }

    public Grandparent setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Grandparent setAge(int age) {
        this.age = age;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Grandparent setHeight(int height) {
        this.height = height;
        return this;
    }
}
