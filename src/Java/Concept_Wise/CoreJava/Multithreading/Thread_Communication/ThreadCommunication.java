package Java.Concept_Wise.CoreJava.Multithreading.Thread_Communication;

class SharedResources {
    private int data;
    private boolean hasData;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer implements Runnable {
    private SharedResources resources;

    public Producer(SharedResources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resources.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResources resources;

    public Consumer(SharedResources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int value = resources.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResources resources = new SharedResources();
        Thread prodcerThread = new Thread(new Producer(resources));
        Thread consumerThread = new Thread(new Consumer(resources));

        prodcerThread.start();
        consumerThread.start();
    }
}
