package Java.Concept_Wise.CoreJava.Generics.GenericClass;

public class Box<T> {   //  Box is now type safe.
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(112);
        int item1 = integerBox.getItem();
        System.out.println(item1);
    }
}
