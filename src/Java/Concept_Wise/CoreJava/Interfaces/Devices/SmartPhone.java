package Java.Concept_Wise.CoreJava.Interfaces.Devices;

public class SmartPhone implements MusicPlayer, Phone, Camera {
    @Override
    public void clickPhoto() {
        System.out.println("Photos has clicked.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Videos has recorded.");
    }

    @Override
    public void playMusic() {
        System.out.println("Music is playing.\nWe danced together.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music has stopped.");
    }


    @Override
    public void makeCall(String name) {
        System.out.println("Calling to " + name);
    }

    @Override
    public void endCall(String talkTime) {
        System.out.println("Talk time " + talkTime);
    }
}
