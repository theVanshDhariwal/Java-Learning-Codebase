package Java.Chapter_Wise.Chapter_02;

public class Resulting_Data_Types_08 {
    public static void main(String[] args) {
        byte B = 4;
        short S = 7;
        int I = 4;
        long L = 6l;
        char C = 'V';
        float F = 45.76f;
        double D = 89.34;
        System.out.println(B + S); // short
        System.out.println(B + I); // int
        System.out.println(B + L); // long
        System.out.println(B + C); // char
        System.out.println(B + F); // float
        System.out.println(B + D); // double
        System.out.println(S + I); // int
        System.out.println(S + L); // long
        System.out.println(S + C); // short
        System.out.println(S + F); // float
        System.out.println(S + D); // double
        System.out.println(I + L); // long
        System.out.println(I + C); // int
        System.out.println(I + F); // float
        System.out.println(I + D); // double
        System.out.println(L + C); // long
        System.out.println(L + F); // float
        System.out.println(L + D); // double
        System.out.println(C + F); // float
        System.out.println(C + D); // double
        System.out.println(F + D); // double

        // Increment and Decrement Operators.
        // Quick Quiz.

        int y = 7;
        int x = ++y * 8;
        System.out.println(x);// The value of v will be 64.

        char A = 'C';
        A++;// Now the value of A is D.
        System.out.println(A);
    }
}
