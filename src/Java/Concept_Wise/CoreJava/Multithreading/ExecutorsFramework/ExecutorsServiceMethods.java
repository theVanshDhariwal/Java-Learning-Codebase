package Java.Concept_Wise.CoreJava.Multithreading.ExecutorsFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorsServiceMethods {
    // public static void main(String[] args) throws ExecutionException,
    // InterruptedException, CancellationException {
    // ExecutorService executorService = Executors.newFixedThreadPool(2);
    // Future<Integer> submit = executorService.submit(() -> 1 + 2);
    // Integer i = submit.get();
    // System.out.println("Sum is: " + i);
    // executorService.shutdown();
    // Thread.sleep(1);
    // System.out.println("Is Terminated: " + executorService.isTerminated());
    // }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<Integer> callable1 = () -> {
            Thread.sleep(500);
            System.out.println("Task 1");
            return 10;
        };
        Callable<Integer> callable2 = () -> {
            Thread.sleep(500);
            System.out.println("Task 2");
            return 20;
        };
        Callable<Integer> callable3 = () -> {
            Thread.sleep(500);
            System.out.println("Task 3");
            return 30;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
        // List<Future<Integer>> futures = executorService.invokeAll(list);     //  invokeAll without time
//        List<Future<Integer>> futures = null;
//
//        try {
//            futures = executorService.invokeAll(list, 2, TimeUnit.SECONDS);     //  invokeAll with time
//        } catch (InterruptedException e) {
//
//        }
//        for (Future<Integer> f : futures) {
//            try {
//                System.out.println(f.get());
//            } catch (InterruptedException e) {
//
//            } catch (ExecutionException e) {
//
//            } catch (CancellationException e) {
//
//            }
//        }

        try {
            Integer i = executorService.invokeAny(list);     //  invokeAny without time
            System.out.println(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

//        try {
//            Integer i = executorService.invokeAny(list, 2, TimeUnit.SECONDS);
//            System.out.println(i);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        } catch (TimeoutException e) {
//            throw new RuntimeException(e);
//        }

        executorService.shutdown();
        System.out.println("Total Taken Time: " + (System.currentTimeMillis() - startTime));
        System.out.println("All done buddy.");
    }
}
