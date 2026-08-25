package Java.Concept_Wise.CoreJava.Exeption;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UncheckedException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Vansh.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}