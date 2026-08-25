package Java.Concept_Wise.Java_8;

public class Main {
    public static void main(String[] args) {
        Employee employee = (name) -> "Name: " + name;

        System.out.println(employee.getName("Vansh Dhariwal"));
    }
}
