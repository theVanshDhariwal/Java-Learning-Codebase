package Java.Concept_Wise.CoreJava.OOPS;

public class TestCar {
    public static void main(String[] args) {
        //  Encapsulation   :-->

        Car car = new Car();

        car.name = "Vansh Dhariwal";// public member

        System.out.println(car.name);

        car.setColor("Green");

        car.getColor();


    }
}
