package Java.Concept_Wise.CoreJava.Multithreading.How_To_Create;

import Java.Concept_Wise.CoreJava.Multithreading.How_To_Create.Extending_Thread_CLass.First;
import Java.Concept_Wise.CoreJava.Multithreading.How_To_Create.Extending_Thread_CLass.Second;

public class TestForThreadClass {
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();

        first.start();
        second.start();
    }
}
