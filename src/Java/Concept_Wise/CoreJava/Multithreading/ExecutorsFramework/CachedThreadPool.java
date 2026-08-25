package Java.Concept_Wise.CoreJava.Multithreading.ExecutorsFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        // Used when there are multiple tasks to handle, and we don't know how many exact number of tasks(load of variables), but we know that the tasks are short in time
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        /* ChatGPT :-->
         Executors.newCachedThreadPool()) is best used when you need a flexible number of threads for short-lived, asynchronous tasks, and you don’t know the workload size in advance.
         */

        ExecutorService executorService = Executors.newCachedThreadPool();//(ThreadFactory threadFactory)
       /* ChatGPT: -->
         A ThreadFactory is used when you want control over how threads are created, rather than how many threads you have.

        It answers the question:

        “What should each thread look like?”

        What a ThreadFactory controls

        A ThreadFactory lets you customize:

        Thread name

        Daemon vs non-daemon

        Priority

        UncaughtExceptionHandler

        Thread group

        Logging / metrics on thread creation

        It does not control scheduling or pooling — that’s the executor’s job.

        */
    }
}
