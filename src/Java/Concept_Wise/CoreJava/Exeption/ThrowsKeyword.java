package Java.Concept_Wise.CoreJava.Exeption;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static void method1() throws IOException {
        method2();
    }

    public static void method2() throws FileNotFoundException {
        FileReader fileReader = new FileReader("Test.txt");
    }
}