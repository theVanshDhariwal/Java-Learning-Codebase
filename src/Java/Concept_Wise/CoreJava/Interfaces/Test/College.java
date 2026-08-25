package Java.Concept_Wise.CoreJava.Interfaces.Test;

import Java.Concept_Wise.CoreJava.Interfaces.Devices.SmartPhone;

public class College {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.makeCall("Elon Musk");
        smartPhone.endCall("4.56.34");
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.clickPhoto();
        smartPhone.recordVideo();
    }
}