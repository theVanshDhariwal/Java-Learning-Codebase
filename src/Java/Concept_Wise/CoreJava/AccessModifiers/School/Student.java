package Java.Concept_Wise.CoreJava.AccessModifiers.School;

public class Student {

    private int age;
    private String name;

    //Private Constructor
    private Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//Default Keyword/Method/Class

class Student2 {
    void meth() {
        System.out.println("This is meth method with default access modifier.");
    }

    void Student2() {
        System.out.println("This is Student2 constructor with default access modifier");
    }
}
