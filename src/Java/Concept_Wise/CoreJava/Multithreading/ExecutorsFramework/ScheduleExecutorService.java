package Java.Concept_Wise.CoreJava.Multithreading.ExecutorsFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorService {
//    public static void main(String[] args) {
//        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(2);
//        schedule.schedule(() -> System.out.println("Task executed after 5 seconds of delay."), 5, TimeUnit.SECONDS);
//        schedule.shutdown();
//    }

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task executed after every 5 seconds."), 2, 5, TimeUnit.SECONDS);
        scheduler.schedule(() -> {
            System.out.println("Initiating Shutdown...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
    }
}
