package Java.Concept_Wise.CoreJava.InnerClasses.Test.Member;

import Java.Concept_Wise.CoreJava.InnerClasses.member.Truck;
import Java.Concept_Wise.CoreJava.InnerClasses.member.TruckEngine;

public class TestTruck {
    public static void main(String[] args) {
        Truck truck = new Truck("Ashok Leyland");
        TruckEngine truckEngine = new TruckEngine(truck);

        truckEngine.start();
        truckEngine.start();
        truckEngine.stop();
        truckEngine.stop();
    }
}