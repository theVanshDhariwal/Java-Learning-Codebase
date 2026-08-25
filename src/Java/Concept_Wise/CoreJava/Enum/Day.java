package Java.Concept_Wise.CoreJava.Enum;

public enum Day {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THUSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String lower;

    Day(String lower) {
        System.out.println("Our constructor called.");
        this.lower = lower;
    }

    public String getLower() {
        return lower;
    }

    public void display() {
        System.out.println("This is " + this.name());
    }
}