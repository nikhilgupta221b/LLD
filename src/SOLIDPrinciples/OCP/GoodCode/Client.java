package SOLIDPrinciples.OCP.GoodCode;

public class Client {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        UPI upi = new UPI();
        PaymentProcessor paymentProcessor = new PaymentProcessor(upi, 100.0);
    }
}
