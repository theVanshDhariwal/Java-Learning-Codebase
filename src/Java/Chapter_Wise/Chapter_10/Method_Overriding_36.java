package Java.Chapter_Wise.Chapter_10;

class EkClass {
    public void Method1() {
        System.out.println("I am in Method1 of EkClass.");
    }

    public void Method2() {
        System.out.println("I am in Method2 of EkClass.");
    }
}

class DoClass extends EkClass {
    @Override
    public void Method2() {
        System.out.println("I am in Method2 of DoClass.");
    }

    public void Method3() {
        System.out.println("I am in Method3 of DoClass.");
    }
}

public class Method_Overriding_36 {
    public static void main(String[] args) {
        DoClass Do = new DoClass();
        Do.Method1();
        Do.Method2();
        Do.Method3();
    }
}
