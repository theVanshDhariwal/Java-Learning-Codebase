package Java.Chapter_Wise.Chapter_10;

class Base {
    String x;

    public void SetX(String b) {
        x = b;
    }

    public String GetX() {
        System.out.println("I am in Base.");
        return x;
    }
}

class Derived extends Base { // This is inheritance.
    String y;

    public void SetY(String d) {
        y = d;
    }

    public String GetY() {
        System.out.println("I am in Derived.");
        return y;
    }
}

class SecondDerived extends Derived {
    String z;

    public void SetZ(String sd) {
        z = sd;
    }

    public String GetZ() {
        System.out.println("I am in SecondDerived.");
        return z;
    }
}

public class Inheritance_33 {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        SecondDerived sd = new SecondDerived();
        // Though the Base object.
        System.out.println();
        b.SetX("Setting b via Base object.");
        System.out.println(b.GetX());
        // Though the Derived object.
        System.out.println();
        d.SetX("Setting b via Derived object.");
        System.out.println(d.GetX());
        d.SetY("Setting d via Derived object.");
        System.out.println(d.GetY());
        // Though the SecondDerived object.
        System.out.println();
        sd.SetX("Setting b via SecondDerived object.");
        System.out.println(sd.GetX());
        sd.SetY("Setting d via SecondDerived object.");
        System.out.println(sd.GetY());
        sd.SetZ("Setting sd via SecondDerived object.");
        System.out.println(sd.GetZ());
    }
}