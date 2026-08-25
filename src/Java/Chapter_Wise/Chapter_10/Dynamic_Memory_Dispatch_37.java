package Java.Chapter_Wise.Chapter_10;

class Phone {
    public void Call() {
        System.out.println("Calling via Phone...");
    }

    public void On() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void Music() {
        System.out.println("Playing music with SmartPhone...");
    }

    public void On() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class Dynamic_Memory_Dispatch_37 {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.Call();
        obj.On();
        // obj.music(); Not allowed and through error.
    }
}
