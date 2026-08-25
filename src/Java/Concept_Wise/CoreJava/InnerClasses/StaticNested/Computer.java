package Java.Concept_Wise.CoreJava.InnerClasses.StaticNested;

import java.beans.ConstructorProperties;

public class Computer {
    private String brand;
    private String model;

    private operatingSystem os;

    public static int a = 10;

    //    Static Nested class
    public static class USB {
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void displayType() {
            System.out.println("USB type: " + type);
        }

    }

    public operatingSystem getOs() {
        return os;
    }

    @ConstructorProperties({"model", "brand", "osName"})
    public Computer(String model, String brand, String osName) {
        this.model = model;
        this.brand = brand;
        this.os = new operatingSystem(osName);
    }

    //    Member class
    public class operatingSystem {
        private String osName;

        @ConstructorProperties("osName")
        public operatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("Computer Model: " + model + ", OS: " + osName + ", Brand: " + brand);
        }

        public void sayHello() {
            System.out.println("Hello bhai kya haal hai!");
        }
    }
}