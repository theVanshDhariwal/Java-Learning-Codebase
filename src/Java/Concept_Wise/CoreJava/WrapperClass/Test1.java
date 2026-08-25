package Java.Concept_Wise.CoreJava.WrapperClass;

public class Test1 {
    public static void main(String[] args) {
        Student x = new Student();
        x.id = 1;
        func(x);
        System.out.println(x.id);
    }

    private static void func(Student a) {
//        Student student = new Student();
//        student.id = 2;
//        a = student;

        a.id = 2;
    }
}

class Student {
    public int id;
}