package Java.Concept_Wise.CoreJava.Exeption;

import Java.Concept_Wise.CoreJava.Exeption.CustomException.InsufficentFundsException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withDraw(double amount) throws InsufficentFundsException {
        if (amount > balance) {
            throw new InsufficentFundsException(amount);
        }
        balance -= amount;
    }
}