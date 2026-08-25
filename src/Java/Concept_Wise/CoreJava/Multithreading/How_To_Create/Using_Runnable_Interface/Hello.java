package Java.Concept_Wise.CoreJava.Multithreading.How_To_Create.Using_Runnable_Interface;

public class Hello implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " Hello");
        }
    }
}
