package Java.Concept_Wise.CoreJava.Generics.GenericInterface;

/*
public class GenericContainer implements Container<String> { //    Set the Wrapper at the moment of inheritance.
    private String str;

    @Override
    public void func(String str) {
        this.str = str;
    }

    @Override
    public String get() {
        return str;
    }

    public static void main(String[] args) {
        GenericContainer genericContainer = new GenericContainer();

        genericContainer.func("Vansh Dhariwal");
        System.out.println(genericContainer.get());
    }
}
 */

public class GenericContainer<T> implements Container<T> {
    private T item;

    @Override
    public void func(T type) {

    }

    @Override
    public T get() {
        return null;
    }

    public static void main(String[] args) {
        GenericContainer<Integer> integerGenericContainer = new GenericContainer<>(); //    Set the wrapper at moment of creation of the object.

        integerGenericContainer.func(112);
        System.out.println(integerGenericContainer.get());
    }
}
