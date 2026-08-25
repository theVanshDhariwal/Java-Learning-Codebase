package Java.Chapter_Wise.Chapter_02;

public class Associativity_and_Precedence_of_Operators_07 {
    public static void main(String[] args) {
        // See the notes and search on Google, Associativity & Precedence of operators
        // in java.
        // Quick Quiz:--> pg.no.:--> 09
        // 1. :-->
        int x = 2, y = 5;
        int X = (x + y) / 2;
        System.out.println(X);

        // 2. :-->
        int a = 3, b = 9, c = 4;
        int d = ((b * b) - 4 * a * c) / 2 * a;
        System.out.println(d);

        // 3. :-->
        int v = 7, u = 3;
        int V = (v * v) - (u * u);
        System.out.println(V);

        // 4. :-->
        int A = 5, B = 7, D = 3;
        int C = (A * B) - D;
        System.out.println(C);
    }
}
