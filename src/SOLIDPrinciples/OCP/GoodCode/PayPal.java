package SOLIDPrinciples.OCP.GoodCode;

public class PayPal implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via PayPal: " + amount);
    }
}
