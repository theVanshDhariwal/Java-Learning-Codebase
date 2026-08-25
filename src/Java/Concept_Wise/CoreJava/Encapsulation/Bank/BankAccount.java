package Java.Concept_Wise.CoreJava.Encapsulation.Bank;

public class BankAccount {

    private String name;

    private String accountNumber;

    private double balance;

    public String getName() {
        return name;
    }

    public BankAccount setName(String name) {
        if (name.startsWith("#") || name.startsWith("@")) {
            System.out.println("The name can't starts with " + name + ".");
        } else {
            this.name = name;
        }
        return this;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double balance) {
        if (balance <= 0) {
            System.out.println("Invalid amount!");
        } else {
            this.balance += balance;
            System.out.println("Your cash " + balance + "has been deposited, and your current balance is: " + getBalance());
        }
    }

    public void withdrawMoney(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount!");
        } else {
            this.balance -= amount;
            System.out.println("Your cash " + amount + " has been withdrew, and your current balance is: " + getBalance());
        }
    }
}