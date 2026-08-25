//  Polymorphism   :-->

package Java.Concept_Wise.CoreJava.OOPS;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.makeSound();
    }
}
