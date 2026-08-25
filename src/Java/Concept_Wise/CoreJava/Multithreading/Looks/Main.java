package Java.Concept_Wise.CoreJava.Multithreading.Looks;

public class Main {
    static void main(String[] args) {
        BankAccount cbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                cbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");

        t1.start();
//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {
//
//        }
        t2.start();
    }
}
