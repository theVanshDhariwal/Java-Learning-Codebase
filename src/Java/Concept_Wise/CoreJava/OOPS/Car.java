//  Encapsulation   :-->

package Java.Concept_Wise.CoreJava.OOPS;

public class Car {

    String name;

    private String brand;

    private String color;

    private String model;

    private int number;

    private String year;

    public String getYear() {
        return year;
    }

    public int getNumber() {
        return number;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Car setNumber(int number) {
        this.number = number;
        return this;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public static void main(String[] args) {

    }
}
