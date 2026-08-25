package Java.Concept_Wise.CoreJava.Generics.GenericExeptions;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException(112);
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            throw new MyException("String");
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
