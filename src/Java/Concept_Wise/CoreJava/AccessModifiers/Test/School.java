package Java.Concept_Wise.CoreJava.AccessModifiers.Test;

public class School {
    private static School instance;

    private School() {
    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }
}