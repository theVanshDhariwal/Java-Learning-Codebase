package Java.Concept_Wise.CoreJava.WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {
        Byte B = 1;
        Short S = 2;
        Integer I = Integer.valueOf(3);/* Boxing --> primitive data type to Wrapper class */
        int i = I.intValue();/* Unboxing --> Wrapper class to primitive data type */
        Long L = 4l;

        Float F = 2.5f;
        Double D = 45.7;

        Character C = 'V';

        Boolean Bool = true;
    }

    public void use() {
        List<Integer> list = new ArrayList<>();/* List<int> list = new ArrayList<>(); */
    }
}