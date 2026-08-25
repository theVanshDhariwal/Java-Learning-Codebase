package Java.Concept_Wise.CoreJava.Multithreading.ExecutorsFramework;

import java.util.concurrent.*;

public class FuturesExample {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<String> submit = executorService.submit(() -> "Hello Bhai");
//        System.out.println(submit.get());
//        executorService.shutdown();
//    }

//    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Runnable runnable = () -> System.out.println("Hello Vansh");
//        executorService.submit(runnable);
//        executorService.shutdown();
//    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> submit = executorService.submit(() -> System.out.println("This is (Runnable Task, T result)"), "Success");
        System.out.println(submit.get());
        executorService.shutdown();
    }

//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Callable callable = (() -> "Hello Bhai kya haal hai.");
//        Future submit = executorService.submit(callable);
//        System.out.println(submit.get());
//        executorService.shutdown();
//    }
}
