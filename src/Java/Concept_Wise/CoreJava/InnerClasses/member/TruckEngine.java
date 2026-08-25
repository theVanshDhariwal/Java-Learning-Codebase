package Java.Concept_Wise.CoreJava.InnerClasses.member;

public class TruckEngine {
    private Truck truck;

    public TruckEngine(Truck truck) {
        this.truck = truck;
    }

    public void start() {
        if (!truck.isEngineOn()) {
            truck.setEngineOn(true);
            System.out.println(truck.getModel() + " engine started.");
        } else {
            System.out.println(truck.getModel() + " engine is already on.");
        }
    }

    public void stop() {
        if (truck.isEngineOn()) {
            truck.setEngineOn(false);
            System.out.println(truck.getModel() + " engine stoped.");
        } else {
            System.out.println(truck.getModel() + " engine is already off.");
        }
    }
}