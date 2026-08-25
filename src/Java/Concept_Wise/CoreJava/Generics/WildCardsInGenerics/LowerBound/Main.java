package Java.Concept_Wise.CoreJava.Generics.WildCardsInGenerics.LowerBound;

import java.util.List;

public class Main {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {

    }
}
