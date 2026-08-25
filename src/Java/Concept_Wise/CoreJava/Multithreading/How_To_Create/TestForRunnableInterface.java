package Java.Concept_Wise.CoreJava.Multithreading.How_To_Create;

import Java.Concept_Wise.CoreJava.Multithreading.How_To_Create.Using_Runnable_Interface.Hello;
import Java.Concept_Wise.CoreJava.Multithreading.How_To_Create.Using_Runnable_Interface.World;

public class TestForRunnableInterface {
    public static void main(String[] args) {
        Hello hello = new Hello();
        World world = new World();

        Thread t1 = new Thread(hello);
        Thread t2 = new Thread(world);

        t1.start();
        t2.start();
    }
}
