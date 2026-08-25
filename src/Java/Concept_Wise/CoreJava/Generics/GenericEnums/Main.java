package Java.Concept_Wise.CoreJava.Generics.GenericEnums;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);

        Day monday = Day.MONDAY;
        System.out.println(monday);

//        Day day = "Tuesday";  // It'll throw a compile time error.
    }
}
