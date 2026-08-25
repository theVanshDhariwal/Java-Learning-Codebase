package Java.Chapter_Wise.Chapter_11;

interface HornType {
    int a = 10;

    void truck();

    void car();

    void bike();
}

interface SideSignal {
    void back();

    void left();

    void right();
}

class Implement implements HornType, SideSignal {
    public void truck() {
        System.out.println("mein jatt yamla pagla dewana ho rabba itni si baat na jana!");
    }

    public void car() {
        System.out.println("pee pee peeeeee.....");
    }

    public void bike() {
        System.out.println("poooo.........");
    }

    public void back() {
        System.out.println("This is a back light signal.");
    }

    public void left() {
        System.out.println("This is a left light signal.");
    }

    public void right() {
        System.out.println("This is a right light signal.");
    }
}

public class Interfaces_41 {
    public static void main(String[] args) {
        Implement imp = new Implement();
        imp.truck();
        imp.bike();
        imp.back();
        System.out.println();
        // imp.a = 15; through error.
        System.out.println(HornType.a);
    }
}
