package Java.Concept_Wise.CoreJava.polymorphism.CompileTime;

public class CompileTime {
    private int a;
    private int b;
    private int c;
    private int d;

    private int add(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;
    }

    private int add(int a, int b, int c) {
        this.a = a;
        this.b = b;
        return a + b;
    }

    private int add(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        return a + b;
    }

    public static void main(String[] args) {
        CompileTime compileTime = new CompileTime();
        System.out.println(compileTime.add(5, 7));
        System.out.println(compileTime.add(5, 7, 6));
        System.out.println(compileTime.add(5, 7, 4, 9));
    }
}