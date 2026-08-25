package Java.Concept_Wise.CoreJava.InnerClasses.Anonymous;

public class ShoppingCart {
    private double totalAmount;

    private String creditNo;

    public ShoppingCart(double totalAmount, String creditNo) {
        this.totalAmount = totalAmount;
        this.creditNo = creditNo;
    }

    public void paymentProcess(Payment payment) {
        payment.pay(totalAmount, creditNo);
    }
}