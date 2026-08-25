package Java.Concept_Wise.CoreJava.Multithreading.Lambda_Expression;

public class Main {
    public static void main(String[] args) {
        // Runnable Interface
        Runnable obj = () -> System.out.println("Hello it's me Vansh.");

        Thread t1 = new Thread(obj);

        t1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        //Student Interface(With parameters)

        Student engineeringStudent = new Student() {
            @Override
            public String getBio(String name) {
                return name + " is an engineering student.";
            }
        };

        System.out.println(engineeringStudent.getBio("Vansh") + "\n");

        Student lawStudent = name -> name + " is not a law student.";

        System.out.println(lawStudent.getBio("Vansh") + "\n");

        //  HelloWorld Interface(With no parameters)
        HelloWorld greet = () -> System.out.println("Hello from Vansh.");

        greet.greet();

    }
}
