package Java.Concept_Wise.CoreJava.Encapsulation.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student Vansh = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of student: ");
        Vansh.setName(scanner.nextLine());
        Vansh.setRollNumber(116);
        Vansh.setAge(19);
        Vansh.setCourse("BCA");
        Vansh.setSection('B');

        System.out.println(Vansh.getName());
        System.out.println(Vansh.getRollNumber());
        System.out.println(Vansh.getAge());
        System.out.println(Vansh.getCourse());
        System.out.println(Vansh.getSection());

    }
}
