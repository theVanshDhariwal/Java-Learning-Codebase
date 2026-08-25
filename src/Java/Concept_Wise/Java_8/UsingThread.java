package Java.Concept_Wise.Java_8;

public class UsingThread {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello from runnable.");

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(() -> System.out.println("Hello from thread."));

        t1.start();
        t2.start();
    }
}
