package Java.Concept_Wise.CoreJava.Generics.GenericExeptions;

public class MyException extends RuntimeException {
    public <T> MyException(T message) {
        super("Exception related to message: " + message.toString() + " of type: " + message.getClass().getName());
    }
}
