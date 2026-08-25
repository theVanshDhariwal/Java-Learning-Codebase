package Java.Chapter_Wise.Chapter_03;

public class String_Methods_011 {
    public static void main(String[] args) {
        String name = "Vansh Dhariwal";
        System.out.println(name);
        // int length = name.length();
        // System.out.println(length);
        System.out.println(name.length());
        // String Lstring = name.toLowerCase();
        // System.out.println(Lstring);
        System.out.println(name.toLowerCase());
        // String Ustring = name.toUpperCase();
        // System.out.println(Ustring);
        System.out.println(name.toUpperCase());
        String naam = "     Vansh       ";
        System.out.println(naam);
        // String trimed = naam.trim();
        // System.out.println(trimed);
        System.out.println(naam.trim());

        System.out.println(name.substring(3));
        // String nam = name.substring(3, 10);
        // System.out.println(nam);
        System.out.println(name.substring(3, 10));
        System.out.println(name.replace('r', 'l'));
        System.out.println(name.replace("Va", "Aaannn"));
        // boolean bool = name.startsWith("VA");
        // System.out.println(bool);
        System.out.println(name.startsWith("Van"));
        System.out.println(name.endsWith("Van"));

        System.out.println(name.charAt(6)); // Here is a white space at the index 5.
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("a", 5));
        System.out.println(name.indexOf("aytd")); // Returns -1
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.indexOf("a", 8));

        System.out.println(name.equals("Vansh Dhariwal"));
        System.out.println(name.equals("Vansh"));
        System.out.println(name.equalsIgnoreCase("vanSH dhariWAL"));// Returns "true" if the string is same while both
        // strings are differnt in case.
    }
}
