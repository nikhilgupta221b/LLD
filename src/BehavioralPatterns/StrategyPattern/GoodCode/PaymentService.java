package BehavioralPatterns.StrategyPattern.GoodCode;

public class PaymentService {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        paymentStrategy.processPayment();
    }
}
