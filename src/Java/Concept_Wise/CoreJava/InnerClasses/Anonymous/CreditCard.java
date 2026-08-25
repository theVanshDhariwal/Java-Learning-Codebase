package Java.Concept_Wise.CoreJava.InnerClasses.Anonymous;

public class CreditCard implements Payment {
    private String cardNo;

    public CreditCard(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public void pay(double amount, String creditNo) {
        System.out.println(amount + " has been paid using credit card " + cardNo);
    }

}