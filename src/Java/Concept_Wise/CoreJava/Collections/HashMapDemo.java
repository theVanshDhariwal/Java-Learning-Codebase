package Java.Concept_Wise.CoreJava.Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(103, "Vansh");
        map.put(101, "Aayush");
        map.put(102, "Naman");
        /*
        System.out.println(map);
        System.out.println(map.get(101));
        System.out.println(map.get(27354));
        */

        /*
        System.out.println(map.containsKey(103));
        System.out.println(map.containsKey(1034));

        System.out.println(map.containsValue("Naman"));
        System.out.println(map.containsValue("Jhandu"));
        */

        /*
        for (Map.Entry<Integer, String> entry : map.entrySet()) { // It'll return all entries of map.
            System.out.println(entry);
        }

        for (Integer i : map.keySet()) { // It'll return all keys of map.
            System.out.println(i);
        }

        System.out.println(map.values());
        */

//        System.out.println(map.isEmpty());

        /*
        System.out.println(map.remove(105));
        System.out.println(map);
        System.out.println(map.remove(102));
        System.out.println(map);

        System.out.println(map.remove(101, "Ayush"));
        System.out.println(map);
        System.out.println(map.remove(101, "Aayush"));
        System.out.println(map);
        */

        /*
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Fudu");
        map1.put(105, "Yash");

        System.out.println("map : " + map);
        System.out.println("map1 : " + map1);
        map.putAll(map1);
        System.out.println("After putAll : " + map);
        */

        /*
        System.out.println(map);
        map.replace(101, "Asshu");
        System.out.println(map);

        System.out.println(map);
        System.out.println(map.replace(101, "Vansh", "Vedant"));
        System.out.println(map);
        System.out.println(map.replace(101, "Aayush", "Vishu"));
        System.out.println(map);
        */

//        System.out.println(map.size());

//        System.out.println(map.hashCode());

//        System.out.println(map.getClass());

        /*
        for (Map.Entry<Integer, String> i : map.entrySet())
            System.out.println(i);

        for (Map.Entry<Integer, String> i : map.entrySet())
            System.out.println(i.getKey() + " : " + i.getValue());
        */
    }
}
