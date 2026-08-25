package Java.Chapter_Wise.Chapter_13;

class Vansh implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " Times: This is class Vansh.");
        }
    }
}

class Dhariwal implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " Times: This is class Dhariwal.");
        }
    }
}

public class MultithreadingUsingRunnableInterface {
    public static void main(String[] args) {
        Runnable vansh = new Vansh();
        Thread t1 = new Thread(vansh);

        Runnable dhariwal = new Dhariwal();
        Thread t2 = new Thread(dhariwal);

        t1.start();
        t2.start();

    }
}
