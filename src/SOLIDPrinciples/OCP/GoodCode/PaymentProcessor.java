package SOLIDPrinciples.OCP.GoodCode;

public class PaymentProcessor {
    public PaymentProcessor(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
