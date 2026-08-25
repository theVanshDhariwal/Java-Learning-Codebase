package Java.Chapter_Wise.Chapter_13;

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " I am chatting with her.");
            System.out.println(i + " I am happy.");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " She is chatting with me.");
            System.out.println(i + " She is happy.");
            i++;
        }
    }
}

public class MultithreadingUsingThreadClass_48 {
    public static void main(String[] args) {
        System.out.println("Hello Bhai!");
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        thread1.start();
        thread2.start();

    }
}
