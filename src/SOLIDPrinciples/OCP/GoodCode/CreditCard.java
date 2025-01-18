package SOLIDPrinciples.OCP.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via Credit Card: " + amount);
    }
}
