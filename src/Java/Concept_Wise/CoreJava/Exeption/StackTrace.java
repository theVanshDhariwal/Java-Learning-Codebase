package Java.Concept_Wise.CoreJava.Exeption;

public class StackTrace {
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception e) {
            e.printStackTrace();

//            StackTraceElement[] stackTrace = e.getStackTrace();
//            for (int i = 0; i < stackTrace.length; i++) {
//                System.out.println(stackTrace[i]);
//            }
        }
    }

    static void level1() {
        level2();
    }

    static void level2() {
        level3();
    }

    static void level3() {
        int[] array = new int[5];
        array[7] = 12;
    }
}