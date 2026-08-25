package Java.Concept_Wise.CoreJava.Multithreading.Looks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outer method.");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method.");
        } finally {
            lock.unlock();
        }
    }

    static void main() {
        Test test = new Test();
        test.outerMethod();
    }
}


