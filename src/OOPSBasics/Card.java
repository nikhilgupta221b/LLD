package OOPSBasics;

abstract public class Card implements PaymentMethods {
    protected String cardNumber;
    protected String userName;

    public Card(String cardNumber, String userName) {
        this.cardNumber = cardNumber;
        this.userName = userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getUserName() {
        return userName;
    }
}
