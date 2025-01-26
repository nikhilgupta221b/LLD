package BehavioralPatterns.StrategyPattern.BadCode;

public class PaymentService {
    public void pay(String paymentMethod) {
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Making payment via Credit Card.");
        }
        else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via Debit Card.");
        }
        else {
            System.out.println("Not supported.");
        }
    }
}
