package Java.Concept_Wise.CoreJava.Multithreading.LIfeCycle;

public class LifeCycle {
    static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
        Thread.sleep(100);
        System.out.println(myThread.getState());
        myThread.join();
        System.out.println(myThread.getState());


    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}