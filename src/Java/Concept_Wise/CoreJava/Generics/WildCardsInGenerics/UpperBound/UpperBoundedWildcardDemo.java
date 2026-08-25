package Java.Concept_Wise.CoreJava.Generics.WildCardsInGenerics.UpperBound;

import java.util.List;

public class UpperBoundedWildcardDemo {
    public static double sum(List<? extends Number> numbers) {
        double total = 0.0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }


    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        System.out.println("Sum of integers: " + sum(intList));
        System.out.println("Sum of doubles: " + sum(doubleList));

        List<? extends Number> numbers = List.of(1, 2, 3);
        // numbers.add(4); // Error: You can't add elements, because it doesn't know the exact type
        numbers.add(null); // Valid: You can add null
    }
}