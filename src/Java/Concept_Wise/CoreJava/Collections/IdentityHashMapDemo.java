package Java.Concept_Wise.CoreJava.Collections;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();

        String key1 = new String("Vansh");
        String key2 = new String("Vansh");

        map.put(key1, 90);
        map.put(key2, 97);

        System.out.println(map);
    }
}
