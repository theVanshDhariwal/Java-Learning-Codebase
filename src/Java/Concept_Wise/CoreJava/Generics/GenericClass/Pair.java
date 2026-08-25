package Java.Concept_Wise.CoreJava.Generics.GenericClass;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.value = value;
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> stringIntegerPair = new Pair<>("Age", 19);

        String key1 = stringIntegerPair.getKey();
        Integer value1 = stringIntegerPair.getValue();

        System.out.println(key1 + ": " + value1);
    }
}
