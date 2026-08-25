package Java.Concept_Wise.CoreJava.Atomicity;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounter {
    private AtomicInteger counter = new AtomicInteger();

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileCounter volatileCounter = new VolatileCounter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                volatileCounter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                volatileCounter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(volatileCounter.getCounter());
    }
}
