package Java.Concept_Wise.CoreJava.Multithreading.ExecutorsFramework;

import java.util.concurrent.*;

public class FutureMethods {
//    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<Integer> future = executorService.submit(() -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                System.out.println("Exception Occurred: " + e);
//                throw new RuntimeException(e);
//            }
//            return 12;
//        });
//
//        try {
//            Integer i = future.get(1, TimeUnit.SECONDS);
//            System.out.println("Is future done: " + future.isDone());
//            System.out.println(i);
//        } catch (InterruptedException | ExecutionException | TimeoutException e) {
//            System.out.println("Exception Occurred: " + e);

    /// /            throw new RuntimeException(e);
//        }
//        executorService.shutdown();
//        System.out.println("Total Taken Time: " + (System.currentTimeMillis() - startTime));
//    }
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return 12;
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            future.cancel(false);
            System.out.println(future.isCancelled());
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException | CancellationException e) {
            System.out.println("Exception Occurred: " + e);
        }
        executorService.shutdown();
    }
}
