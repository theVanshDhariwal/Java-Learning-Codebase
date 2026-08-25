package Java.Concept_Wise.CoreJava.Multithreading.Synchronization;

public class Counter {
    private int count = 0;

    public synchronized void increment() {  // Mutual Exclusion/Race Condition
        count++;
    }

    public int getCount() {
        return count;
    }
}
