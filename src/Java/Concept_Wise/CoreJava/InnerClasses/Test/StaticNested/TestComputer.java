package Java.Concept_Wise.CoreJava.InnerClasses.Test.StaticNested;

import Java.Concept_Wise.CoreJava.InnerClasses.StaticNested.Computer;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("EliteBook", "HP", "Windows");
        computer.getOs().sayHello();
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("Type-C");
        usb.displayType();
    }
}