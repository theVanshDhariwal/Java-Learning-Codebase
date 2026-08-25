package Java.Concept_Wise.CoreJava.Collections;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>(5, 0.2f, true); // Has order & double linked list.
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n" + linkedHashMap.getOrDefault("Guava", 0));
        System.out.println(linkedHashMap.getOrDefault("Banana", 0));

        linkedHashMap.putIfAbsent("Apple", 5);
        System.out.println();
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
