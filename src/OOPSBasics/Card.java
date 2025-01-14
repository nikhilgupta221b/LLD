package OOPSBasics;

public class Card implements PaymentMethods {
    protected String cardNumber;
    protected String userName;

    Card(String cardNumber, String userName) {
        this.cardNumber = cardNumber;
        this.userName = userName;
    }

    @Override
    public void pay() {

    }
}
