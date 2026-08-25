package Java.Concept_Wise.Java_8;

import java.util.*;

public class UsingComparator {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(37);
        list.add(452);
        list.add(9);
        list.add(342);
        System.out.println("Original: " + list);
        Collections.sort(list);
        System.out.println("Natural: " + list);
        Collections.sort(list, (a, b) -> b - a);
        System.out.println("Descending: " + list);
        */

        /*
        Set<Integer> set1 = new TreeSet<>();
        set1.add(43);
        set1.add(4);
        set1.add(433);
        set1.add(76);
        set1.add(108);
        System.out.println("Before manual sorting: " + set1);
        Set<Integer> set2 = new TreeSet<>((a, b) -> b - a);
        set2.add(43);
        set2.add(4);
        set2.add(433);
        set2.add(76);
        set2.add(108);
        System.out.println("After manual sorting: " + set2);
        */

        /*
        Map<Integer, String> map1 = new TreeMap();
        map1.put(43, "E");
        map1.put(4, "C");
        map1.put(433, "A");
        map1.put(76, "D");
        map1.put(108, "B");
        System.out.println("Before manual sorting: " + map1);
        Map<Integer, String> map2 = new TreeMap<>((a, b) -> b - a);
        map2.put(43, "E");
        map2.put(4, "C");
        map2.put(433, "A");
        map2.put(76, "D");
        map2.put(108, "B");
        System.out.println("After manual sorting: " + map2);
        */

        Student s1 = new Student(101, "Vansh");
        Student s2 = new Student(103, "Vansh");
        Student s3 = new Student(102, "Vansh");
        List<Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        System.out.println("Before manual sorting: " + list1);
        Collections.sort(list1, (a, b) -> a.getId() - b.getId());
        System.out.println("After 1st manual sorting: " + list1);
        Collections.sort(list1, (a, b) -> b.getId() - a.getId());
        System.out.println("After 2nd manual sorting: " + list1);


    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}