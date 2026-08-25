package Java.Concept_Wise.CoreJava.Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    /*
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        System.out.println(integers);
        integers.addFirst(0);
        System.out.println(integers);
        integers.addLast(4);
        System.out.println(integers);
        integers.add(2, 20);
        System.out.println(integers);
        System.out.println("getting the 3rd index element: " + integers.get(3));
        System.out.println("The first element is: " + integers.getFirst());
        System.out.println("The last element is: " + integers.getLast());
        System.out.println(integers.contains(20));
        Iterator<Integer> it = integers.descendingIterator();

        System.out.println("\nintegers.descendingIterator(): ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n" + integers.element());  // Returns the head.
        System.out.println(integers.indexOf(4));
        System.out.println("Last occurrence of 3 is: " + integers.lastIndexOf(3));
        System.out.println(integers);

        integers.remove();  // Removes the first element.
//        integers.removeFirst();
        integers.removeLast();
        integers.removeIf(x -> (x & 1) == 1);

        Object clone = integers.clone();
        System.out.println(clone);

        integers.clear();
        System.out.println(integers);
        System.out.println(clone);

    }

     */


    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog", "Cat", "Elephant"));
        System.out.println(animals);
        animals.removeAll(Arrays.asList("Elephant", "Lion"));
        System.out.println(animals);
        animals.addAll(Arrays.asList("Horse", "Camel"));
        System.out.println(animals);
        animals.add(0, "Friend");
        System.out.println(animals);

    }
}
