package Java.Concept_Wise.CoreJava.Generics.GenericConstructors;

public class Main {
    public <T> Main(T t) {
        System.out.println("you filled: " + t);
    }

    public static void main(String[] args) {
        Main main1 = new Main("This is a String");  // String
        Main main2 = new Main(112); //  Integer
    }
}
