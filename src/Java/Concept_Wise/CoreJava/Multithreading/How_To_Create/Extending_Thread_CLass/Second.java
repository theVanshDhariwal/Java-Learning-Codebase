package Java.Concept_Wise.CoreJava.Multithreading.How_To_Create.Extending_Thread_CLass;

public class Second extends Thread {
    @Override
    public void run() {
//        int i = 1;
//        while (true) {
//            System.out.println(i++ + " Second");
//        }


        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " Second");
        }
    }
}
