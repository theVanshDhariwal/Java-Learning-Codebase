package Java.Concept_Wise.CoreJava.Static;

public class StaticKeyword {
    //    Static Attributes
    private static int count = 0;

    //    Constructor
    public StaticKeyword() {
        count++;
    }

    //    Static Method
    public static void greet() {
        System.out.println("Hello from Vansh Dhariwal.");
    }

    //   Non-static Method
    public void sayBye() {
        System.out.println("Bye from Vansh Dhariwal.");
    }

    //   Static Block
    static {
        System.out.println("This is a static block.");
        count++;
    }


    public static void main(String[] args) {
        StaticKeyword sk1 = new StaticKeyword();
        StaticKeyword sk2 = new StaticKeyword();
        System.out.println(StaticKeyword.count);
        StaticKeyword sk3 = new StaticKeyword();
        StaticKeyword sk4 = new StaticKeyword();
        StaticKeyword sk5 = new StaticKeyword();
        StaticKeyword.greet();
        System.out.println(StaticKeyword.count);
        System.out.println(StaticKeyword.sum(4, 6));


    }

    public static int sum(int a, int b) {
        return a + b;
    }
}