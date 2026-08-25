package Java.Chapter_Wise.Chapter_11;

interface Camera2 {
    void takePhoto();

    void recordVideo();
}

interface WiFi2 {
    String[] getNetwork();

    void connectToNetwork(String net);

    void connectedNetwork(String net);

}

class CellPhone2 {
    void callNumber(long num) {
        System.out.println("calling to " + num + "...");
    }

    void pickCall(long num) {
        System.out.println("connected with " + num);
    }

}

class SmartPhone3 extends CellPhone2 implements Camera2, WiFi2 {
    public void takePhoto() {
        System.out.println("Taking photo.");
    }

    public void recordVideo() {
        System.out.println("Recording video.");
    }

    public String[] getNetwork() {
        System.out.println("Available networks:");
        String[] network = {"Vansh5G", "Jio4G", "Airtel"};
        return network;
    }

    public void connectToNetwork(String net) {
        System.out.println("Connecting to " + net + "...");
    }

    public void connectedNetwork(String net) {
        System.out.println("connected with " + net);
    }

}

public class Polymorphism_IN_Interfaces_44 {
    public static void main(String[] args) {
        Camera2 cam2 = new SmartPhone3();// This is a Smart Phone, but use it as a Camera.
        // cam2.getNetwork(); --> Not allowed in java.
        cam2.recordVideo();
        SmartPhone2 sp2 = new SmartPhone2();// This is a Smart phone reference therefore it can use all methods.
        sp2.callNumber(9027466053L);
        sp2.pickCall(9027466053L);
        sp2.connectToNetwork(">{SURYAVANSHI}<");
    }
}
