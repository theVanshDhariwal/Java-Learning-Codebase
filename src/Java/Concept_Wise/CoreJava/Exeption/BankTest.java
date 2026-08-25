package Java.Concept_Wise.CoreJava.Exeption;

import Java.Concept_Wise.CoreJava.Exeption.CustomException.InsufficentFundsException;

public class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);

        try {
            bankAccount.withDraw(17570);
        } catch (InsufficentFundsException e) {
            System.out.println(e);
        }
    }
}