package Java.Concept_Wise.CoreJava.Generics;

import java.util.ArrayList;

public class WithoutGenerics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("Vansh");
        arrayList.add(112);
        arrayList.add(3.14);
        arrayList.add('B');

        String str = (String) arrayList.get(0);
        int it = (int) arrayList.get(1);
        double doub = (double) arrayList.get(2);
        char ch = (char) arrayList.get(3);

        System.out.println("String: " + str);
        System.out.println("int: " + it);
        System.out.println("double: " + doub);
        System.out.println("char: " + ch);
    }
}
