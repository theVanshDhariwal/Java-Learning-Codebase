package Java.Chapter_Wise.Chapter_11;

interface Camera {
    void takePhoto();

    void recordVideo();

    default void kuchBhiCamera() {
        System.out.println("Ye kuchBhiCamera ka default method hai");
        System.out.println("This is the default method of kuchBhiCamera");
    }
}

interface WiFi {
    String[] getNetwork();

    void connectToNetwork(String net);

    void connectedNetwork(String net);

    default void kuchBhiWiFi() {
        System.out.println("Ye kuchBhiWiFi ka default method hai");
        System.out.println("This is the default method of kuchBhiWiFi");
    }

}

class CellPhone {
    void callNumber(long num) {
        System.out.println("calling to " + num + "...");
    }

    void pickCall(long num) {
        System.out.println("connected with " + num);
    }
}

class SmartPhone2 extends CellPhone implements Camera, WiFi {
    public void takePhoto() {
        System.out.println("Taking photo.");
    }

    public void recordVideo() {
        System.out.println("Recording video.");
    }

    public String[] getNetwork() {
        System.out.println("Available networks:");
        return new String[]{"Vansh5G", "Jio4G", "Airtel"};
    }

    public void connectToNetwork(String net) {
        System.out.println("Connecting to " + net + "...");
    }

    public void connectedNetwork(String net) {
        System.out.println("connected with " + net);
    }

}

public class Default_Methods_42 {
    public static void main(String[] args) {
        SmartPhone2 sm = new SmartPhone2();
        // Camera
        sm.takePhoto();
        sm.recordVideo();
        // CellPhone
        // long num = 9027466053l;
        // sm.callNumber(num);
        // sm.pickCall(num);
        // WiFi
        String[] str = sm.getNetwork();
        for (String string : str) {
            System.out.println(string + "...");
        }
        sm.connectToNetwork(str[0]);
        sm.connectedNetwork(str[0]);
        // Default methods are allowed only in interfaces.
        System.out.println();
        sm.kuchBhiCamera();
        System.out.println();
        sm.kuchBhiWiFi();
        System.out.println();
    }
}
