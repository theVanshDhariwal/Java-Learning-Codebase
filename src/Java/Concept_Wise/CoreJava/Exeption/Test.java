package Java.Concept_Wise.CoreJava.Exeption;

public class Test {
    public static void main(String[] args) {
        int[] numerators = {120, 30, 50, 1000};
        int[] denominators = {12, 0, 10, 5};

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            } catch (IndexOutOfBoundsException b) {
                System.out.println(b);
            }
        }
        System.out.println("Good job.");
    }

    static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException | NullPointerException ar) {
            System.out.println(ar);
            System.out.print("ERROR : ");
            return -1;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}