package Java.Concept_Wise.CoreJava.Exeption.CustomException;

public class InsufficentFundsException extends Exception {
    private double amount;


    public InsufficentFundsException(double amount) {
        super("What do you want ? You don't have money.");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}