//  Inheritance :-->

package Java.Concept_Wise.CoreJava.OOPS;

public class Cat extends Animal {

    String breed;

    float height;

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.breed = "German";
        cat.color = "White";
        cat.name = "Memo";
        cat.age = 5;
        cat.height = 17.6f;

        System.out.println(cat.name);
        System.out.println(cat.breed);
        System.out.println(cat.age + " years.");
        System.out.println(cat.color);
        System.out.println(cat.height + " inches");
        System.out.println();

        cat.makeSound();
    }
}
