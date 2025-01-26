package BehavioralPatterns.StrategyPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.pay("DebitCard");
    }
}
