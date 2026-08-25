package Java.Concept_Wise.CoreJava.InnerClasses.Test.Anonymous;

import Java.Concept_Wise.CoreJava.InnerClasses.Anonymous.Payment;
import Java.Concept_Wise.CoreJava.InnerClasses.Anonymous.ShoppingCart;


public class Test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(1750, "745837689");

        shoppingCart.paymentProcess(new Payment() { //  Anonymous inner class
            @Override
            public void pay(double amount, String creditNo) {
                System.out.println(amount + " has paid by Vansh using " + creditNo);
            }
        });


//        CreditCard creditCard = new CreditCard("376452375");
//        shoppingCart.paymentProcess(creditCard);
    }
}