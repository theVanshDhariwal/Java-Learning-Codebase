package Java.Concept_Wise.CoreJava.Atomicity;

class SharedObjects {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        System.out.println("Writer made the flag true.");
        flag = true;
    }

    public void printFlag() {
        while (!flag) {
            // do nothing.
        }
        System.out.println("Flag is true.");
    }
}

public class VolatileKeyword {
    public static void main(String[] args) {
        SharedObjects sharedObjects = new SharedObjects();
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObjects.setFlagTrue();
        });
        Thread readerThread = new Thread(() -> sharedObjects.printFlag());

        writerThread.start();
        readerThread.start();
    }
}
