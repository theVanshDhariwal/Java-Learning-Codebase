package Java.Concept_Wise.CoreJava.Collections;


import java.util.ArrayList;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Vansh", 4.3));
        students.add(new Student("Ujjwal", 3.3));
        students.add(new Student("Naman", 4.3));
        students.add(new Student("Dev", 5));

        students.sort(null);
        System.out.println(students);
    }
}
