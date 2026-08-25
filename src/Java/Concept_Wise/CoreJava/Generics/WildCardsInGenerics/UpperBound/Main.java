package Java.Concept_Wise.CoreJava.Generics.WildCardsInGenerics.UpperBound;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public void processElements(List<?> elements) {
        // Cannot add elements because we don't know the type.
        for (Object element : elements) {
            System.out.println(element);
        }
    }
}
