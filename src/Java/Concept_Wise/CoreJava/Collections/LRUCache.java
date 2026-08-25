package Java.Concept_Wise.CoreJava.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.5f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> fruits = new LRUCache<>(3);

        fruits.put("Orange", 50);
        fruits.put("Apple", 20);
        fruits.put("Grapes", 30);

        System.out.println(fruits);
        fruits.get("Orange");
        fruits.put("Strawberry", 25);
        System.out.println(fruits);
    }
}
