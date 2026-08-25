package Java.Chapter_Wise.Chapter_10;

class FirstClass {
    int x;

    public FirstClass() {
        System.out.println("I am in FirstClass");
    }

    public FirstClass(int a) {
        System.out.println("I am in FirstClass with the value of a: " + a);
    }

    public void Pehla() {
        System.out.println("The value of x is: " + x);
    }
}

class SecondClass extends FirstClass {
    public SecondClass() {
        this.x = 9;
        System.out.println("I am in SecondClass");
    }

    public SecondClass(int b) {
        super(b);
        System.out.println("I am in SecondClass");
    }
}

public class Keywords_35 {
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        SecondClass sc2 = new SecondClass(6);
        sc.Pehla();
        sc2.Pehla();
    }
}
