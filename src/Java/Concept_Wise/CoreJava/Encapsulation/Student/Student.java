package Java.Concept_Wise.CoreJava.Encapsulation.Student;

public class Student {

    private String name;

    private int rollNumber;

    private int age;

    private String course;

    private char section;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Student setRollNumber(int rollNumber) {
        if (rollNumber <= 0) {
            System.out.println("Invalid Roll Number!");
        } else {
            this.rollNumber = rollNumber;
        }
        return this;
    }


    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        if (age <= 0) {
            this.age = 0;
            System.out.println("Invalid Age!");
        } else {
            this.age = age;
        }
        return this;
    }

    public String getCourse() {
        return course;
    }

    public Student setCourse(String course) {
        this.course = course;
        return this;
    }

    public char getSection() {
        return section;
    }

    public Student setSection(char section) {
        this.section = section;
        return this;
    }
}