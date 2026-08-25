package Java.Concept_Wise.CoreJava.InnerClasses.member;

public class Truck {
    private String model;
    private boolean isEngineOn;

    public Truck(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    public String getModel() {
        return model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }
}