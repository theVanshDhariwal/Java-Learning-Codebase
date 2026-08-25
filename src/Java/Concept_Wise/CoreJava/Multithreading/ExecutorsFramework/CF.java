package Java.Concept_Wise.CoreJava.Multithreading.ExecutorsFramework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CF {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Ok";
        }, executorService);// By doing this it'll use the threads of executorService to complete its tasks.
        completableFuture.join();
        String s = completableFuture.getNow("This is getNow method, which is used to return the result when task is got failed in execution.");
        System.out.println(s);
        System.out.println("Main");
    }
}
