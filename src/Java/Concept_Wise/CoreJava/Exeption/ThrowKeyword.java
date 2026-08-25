package Java.Concept_Wise.CoreJava.Exeption;

import java.io.FileNotFoundException;

public class ThrowKeyword {
    public static void main(String[] args) throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        throw new FileNotFoundException("oops");
    }
}