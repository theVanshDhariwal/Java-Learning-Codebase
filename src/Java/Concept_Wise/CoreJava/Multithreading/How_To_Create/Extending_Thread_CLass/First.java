package Java.Concept_Wise.CoreJava.Multithreading.How_To_Create.Extending_Thread_CLass;

public class First extends Thread {
    @Override
    public void run() {
//        int i = 1;
//        while (true) {
//            System.out.println(i++ + " First");
//        }


        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " First");
        }
    }
}
