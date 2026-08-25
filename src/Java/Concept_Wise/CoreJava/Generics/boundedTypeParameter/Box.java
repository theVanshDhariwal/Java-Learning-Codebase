package Java.Concept_Wise.CoreJava.Generics.boundedTypeParameter;

class Test<T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class Box {
    public static void main(String[] args) {
//        Test<String> stringTest = new Test<String>(); //  Not allowed.
        Test<Integer> integerTest = new Test<>();

        integerTest.setValue(112);
        System.out.println("You set: " + integerTest.getValue());
    }
}