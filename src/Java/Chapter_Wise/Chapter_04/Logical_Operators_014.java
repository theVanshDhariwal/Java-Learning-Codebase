package Java.Chapter_Wise.Chapter_04;

public class Logical_Operators_014 {
    public static void main(String[] args) {
        System.out.println("For logical AND.    :-->");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        System.out.println("For logical OR.    :-->");
        boolean d = true;
        boolean e = false;
        boolean f = true;
        if (d || e || f) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        System.out.println("For logical NOT.    :-->");
        System.out.println("NOT(a) is: " + !a);
        System.out.println("NOT(b) is: " + !b);
    }
}
