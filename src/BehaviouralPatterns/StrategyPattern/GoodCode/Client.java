package BehaviouralPatterns.StrategyPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.pay();

        paymentService.setPaymentStrategy(new UPI());
        paymentService.pay();
    }
}
