package Java.Concept_Wise.CoreJava.Encapsulation.Bank;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setName("Vansh Dhariwal");
        bankAccount.setAccountNumber("CBI2356425");

        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getAccountNumber());


        System.out.println(bankAccount.getBalance());

        bankAccount.depositMoney(10000);

        bankAccount.withdrawMoney(1500);

        System.out.println(bankAccount.getBalance());
    }
}
