package Java.Concept_Wise.CoreJava.Multithreading.ThreadMethods;

//  1st
class Basic extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

//  2nd
class Priority extends Thread {
    public Priority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            String a = "";
            for (int j = 1; j <= 10; j++) {
                a += a;
            }
            System.out.println(Thread.currentThread().getName() + " - priority: " + Thread.currentThread().getPriority() + " - count: " + i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

//    3rd
class Inter extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread is running......");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted! : " + e);
        }
    }
}

//    4th
class Yield extends Thread {
    public Yield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running..");
            Thread.yield();
        }
    }
}

//    5th
//    A daemon thread is a background thread that runs to support user threads, and the JVM does not wait for it to finish when exiting.
class Daemon extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++ + " : Hello World");
        }
    }
}

public class ThreadMethods extends Thread {
    public static void main(String[] args) throws InterruptedException {

//        1st
//        Basic basic = new Basic();
//        basic.start();
//        basic.join();
//        System.out.println("It's over now");


//        2nd
//        Priority low = new Priority("LOW");
//        low.setPriority(Thread.MIN_PRIORITY);
//        Priority medium = new Priority("MEDIUM");
//        medium.setPriority(Thread.NORM_PRIORITY);
//        Priority high = new Priority("HIGH");
//        high.setPriority(Thread.MAX_PRIORITY);
//        low.start();
//        medium.start();
//        high.start();


//        3rd
//        Inter inter = new Inter();
//        inter.start();
//        inter.interrupt();

//        4th
//        Yield y1 = new Yield("First");
//        Yield y2 = new Yield("Second");
//        y1.start();
//        y2.start();

//        5th
//        Daemon daemon = new Daemon();
//        daemon.setDaemon(true);
//        daemon.start();
//        System.out.println("Main has done");

    }
}


// {run start sleep join} setPriority interrupt yield daemon