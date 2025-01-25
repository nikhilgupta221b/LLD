package BehaviouralPatterns.StrategyPattern.GoodCode;

public class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing Payment via Debit Card");
    }
}