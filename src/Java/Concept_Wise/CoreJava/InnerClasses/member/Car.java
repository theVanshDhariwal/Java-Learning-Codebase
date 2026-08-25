package Java.Concept_Wise.CoreJava.InnerClasses.member;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    public class Engine {
        public void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " engine started.");
            } else {
                System.out.println(model + " engine is already on.");
            }
        }

        public void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " engine stoped.");
            } else {
                System.out.println(model + " engine is already off.");
            }
        }
    }
}