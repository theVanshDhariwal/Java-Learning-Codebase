package Java.Concept_Wise.CoreJava.Static;

public class Utils {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static String trimAndUpperCase(String str) {
        if (str != null) {
            return str.trim().toUpperCase();
        } else {
            return "";
        }
    }

    public static String trimAndLowerCase(String str) {
        if (str != null) {
            return str.trim().toLowerCase();
        } else {
            return "";
        }
    }
}