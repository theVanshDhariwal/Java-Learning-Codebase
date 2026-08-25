package Java.Concept_Wise.CoreJava.Multithreading.ExecutorsFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Use CountDownLatch when one or more threads must wait until a fixed number of other operations finish.

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        int numbersOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numbersOfServices);
        CountDownLatch latch = new CountDownLatch(numbersOfServices);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();
        System.out.println("Now main has started.");
        executorService.shutdown();

    }
}

class DependentService implements Callable<String> {
    private final CountDownLatch latch;

    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " Service started.");
        } finally {
            latch.countDown();
        }
        return "Ignore it.";
    }
}
