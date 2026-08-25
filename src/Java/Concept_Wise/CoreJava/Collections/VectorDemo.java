package Java.Concept_Wise.CoreJava.Collections;

import java.util.Vector;

// Use vector when synchronization is to be ensured.
// Vector is Thread safe
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        System.out.println();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Size of list: " + list.size());
    }
}
