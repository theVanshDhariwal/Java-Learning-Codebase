package Java.Concept_Wise.Java_8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void print1(String S) {
        System.out.println(S);
    }

    public void print2(String S) {
        System.out.println(S);
    }


    public static void main(String[] args) {
        MethodReference reference = new MethodReference();
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Max");

        names.forEach(x -> System.out.println(x));
        names.forEach(MethodReference::print1);
        names.forEach(reference::print2);

    }
}
