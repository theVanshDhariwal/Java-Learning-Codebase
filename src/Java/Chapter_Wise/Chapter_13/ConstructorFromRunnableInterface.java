package Java.Chapter_Wise.Chapter_13;

class DhariwalClass implements Runnable {

    public String name;

    public DhariwalClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello this is DhariwalClass. " + name);
    }
}

public class ConstructorFromRunnableInterface {
    public static void main(String[] args) {
        DhariwalClass dhariwalClass = new DhariwalClass("Vansh Dhariwal");
        Thread thread = new Thread(dhariwalClass, dhariwalClass.name);
        thread.start();

    }
}