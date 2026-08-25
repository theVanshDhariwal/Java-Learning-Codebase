package Java.Concept_Wise.CoreJava.InnerClasses.Test.Member;

import Java.Concept_Wise.CoreJava.InnerClasses.member.Car;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Punch");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.start();
        engine.stop();
        engine.stop();
    }
}