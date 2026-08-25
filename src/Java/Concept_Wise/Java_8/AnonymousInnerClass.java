package Java.Concept_Wise.Java_8;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        SoftwareEnginner softwareEnginner = new SoftwareEnginner() {

            @Override
            public String getName() {
                return "Vansh Dhariwal";
            }

            @Override
            public int getSalary() {
                return 100;
            }

            @Override
            public String getDesignation() {
                return "AWS";
            }
        };

        System.out.println("My name is: " + softwareEnginner.getName());
        System.out.println("My designation is: " + softwareEnginner.getDesignation());
        System.out.println("My current salary is: " + softwareEnginner.getSalary());
    }
}
