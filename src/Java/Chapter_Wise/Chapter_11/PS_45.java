package Java.Chapter_Wise.Chapter_11;

// 1. :-->
abstract class Pen {
    abstract void write();

    abstract void refil();
}

// 2. :-->
class FountainPen extends Pen {
    @Override
    void write() {
        System.out.println("Write with pen.");
    }

    @Override
    void refil() {
        System.out.println("Refil the pen with ink.");
    }

    void changeNib() {
        System.out.println("The nib of pen has been cracked.");
    }
}

// 3. :-->
class Monkey {
    void jump() {
        System.out.println("Jump mokey jump bro!");
    }

    void bite() {
        System.out.println("Ooosh bandaro oosh khaja khaja!");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    @Override
    public void sleep() {
        System.out.println("The Bund Baxie is sleeping.");
    }

    @Override
    public void eat() {
        System.out.println("The Bund Baxie is eating.");
    }
}

// 4. :-->
abstract class TelePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelePhone extends TelePhone {
    @Override
    void ring() {
        System.out.println("The smartphone is ringing...");
    }

    @Override
    void lift() {
        System.out.println("So i lifted my smartphone!");
    }

    @Override
    void disconnect() {
        System.out.println("Then smartphone had disconnected!");
    }
}

// 6. :-->
interface SmartTVRemote {
    void smartRemote();
}

interface TVRemote extends SmartTVRemote {
    void remote();
}

// 7 :-->
class TV implements TVRemote {
    @Override
    public void remote() {
        System.out.println("This is a normal remote.");
    }

    @Override
    public void smartRemote() {
        System.out.println("This is a smart remote.");
    }
}

public class PS_45 {
    public static void main(String[] args) {
        // 4. :-->
        SmartTelePhone stp = new SmartTelePhone();
        stp.ring();
        stp.lift();
        stp.disconnect();

        // 5. :-->
        Monkey bandar = new Human();
        bandar.jump();
        bandar.bite();
        BasicAnimal bundBaxi = new Human();
        bundBaxi.eat();
        bundBaxi.sleep();
    }
}
