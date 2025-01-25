package BehaviouralPatterns.StrategyPattern.GoodCode;

public class UPI implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing Payment via UPI");
    }
}
