package Java.FileIO.StringBuffer;

import java.util.Arrays;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Types of StringBuffer constructor
        // 1:
//        StringBuffer sb = new StringBuffer();

        // 2:
//        StringBuffer sb2 = new StringBuffer("Vansh Dhariwal");

        // 3:
//        StringBuffer sb3 = new StringBuffer(30);

        // Methods :-->
//        sb.append("Hello there!");
//        sb.append(" Is your name Vansh?");
//
//        sb.insert(12, " What's up bro.. \n");
//        sb.replace(6, 11, "Vansh");
//        sb.delete(6, 12);
//        System.out.println(sb.capacity());
//        sb.reverse();
//        sb.trimToSize();
//        System.out.println(sb.capacity());

//        String str = sb.toString();
//        System.out.println(str);

        // Random String generation
//        String name = RandomString.generateString(10);
//        System.out.println(name);

        // Removing all whitespaces
//        String sentence = "Hi my     name           Va          nsh  Dhariwal";

//        System.out.println(sentence);
//        System.out.println(sentence.replaceAll("\\s", "_"));
//        System.out.println(sentence.replaceAll("\\s", ""));

        // Splitting the words
//        String names = "Vansh_Nisha_Vishakha_Papa_Momy";
//        String[] arr = names.split("_");

//        System.out.println(Arrays.toString(arr));

        // Rounding off
        DecimalFormat df = new DecimalFormat("000.0000");
        System.out.println(df.format(85.5546464564));

    }
}