package Java.Concept_Wise.CoreJava.Collections;

import java.util.*;
import java.util.ArrayList;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return (o1.length() - o2.length());
    }
}

class MyIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return (o2 - o1);
    }
}

class Student implements Comparable<Student> {
    private final String name;
    private final double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return (name + ": " + gpa);
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.gpa, this.gpa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(1);
        integers.add(2);

        System.out.println(integers);
        integers.sort(null);
        System.out.println(integers);
        integers.sort(new MyIntegerComparator());
        System.out.println(integers);

        List<String> fruits = Arrays.asList("Banana", "apple", "date");

        System.out.println(fruits);
        fruits.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(fruits);
        fruits.sort(new StringLengthComparator());
        System.out.println(fruits);

         */

        //  Via Lambda expression
        /*
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(1);
        integers.add(2);

        System.out.println(integers);
        integers.sort((a, b) -> a - b);
        System.out.println(integers);
        integers.sort((a, b) -> b - a);
        System.out.println(integers);

        List<String> fruits = Arrays.asList("Banana", "apple", "date");

        System.out.println(fruits);
        fruits.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(fruits);
        fruits.sort((a, b) -> a.length() - b.length());
        System.out.println(fruits);
        fruits.sort((a, b) -> b.length() - a.length());
        System.out.println(fruits);

         */

        java.util.ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 3.9));
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Max", 3.2));
        students.add(new Student("Alice", 3.5));
//        students.sort((a, b) -> {
//            if ((a.getGpa() - b.getGpa()) > 0)
//                return -1;
//            if ((a.getGpa() - b.getGpa()) < 0)
//                return 1;
//            else {
//                return a.getName().compareTo(b.getName());
//            }
//        });
//
        // Java 8th feature:
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//        students.sort(comparator);
        Collections.sort(students, comparator);

        for (Student s : students) {
            System.out.println(s);
        }

    }
}

