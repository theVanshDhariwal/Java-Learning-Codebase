package Java.Concept_Wise.CoreJava.Exeption;

public class FinallyKeyword {
    public static void main(String[] args) {
        System.out.println(divide(15, 3));
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            return -1;
        } finally {
            System.out.println("Bye!");
        }
    }
}