package Java.Concept_Wise.CoreJava.Collections;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice", 101); // hashCode1 --> index1
        Person p2 = new Person("Moris", 102); // hashCode2 --> index2
        Person p3 = new Person("Alice", 101); // hashCode3 --> index3

        map.put(p1, "Engineer"); // hashCode1 --> index1
        map.put(p2, "Doctor"); // hashCode2 --> index2
        map.put(p3, "Manager"); // hashCode1 --> index1 --> equals() --> replace

//        System.out.println(map);

        System.out.println("Hashmap size: " + map.size());
        System.out.println("Value of p1: " + map.get(p1));
        System.out.println("Value of p3: " + map.get(p3));


        /*
        HashMap<String, Integer> map1 = new HashMap<>();


        map1.put("Vansh", 44); // hashCode1 --> index1
        map1.put("Megha", 44); // hashCode2 --> index2
        map1.put("Vansh", 88); // hashCode1 --> index1 --> equals() --> replace

        System.out.println(map1);
        */

    }
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}
