package Java.Concept_Wise.CoreJava.Enum;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Day.SUNDAY);
        Day monday = Day.MONDAY;
//        System.out.println(monday.ordinal());// Index
//        System.out.println(monday.name().toLowerCase());// String name
//        Day Enum1 = Day.valueOf("MONDAY");
//        System.out.println(Enum1);
//        Day Enum2 = Day.valueOf("MONdufhDAY");
//        Day[] values = Day.values();
//        for (Day i : values) {
//            System.out.println(i);
//        }

//        monday.display();

        System.out.println(monday.getLower());
    }
}