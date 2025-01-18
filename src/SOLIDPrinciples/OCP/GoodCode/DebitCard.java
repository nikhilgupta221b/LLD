package SOLIDPrinciples.OCP.GoodCode;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via Debit Card: " + amount);
    }
}
