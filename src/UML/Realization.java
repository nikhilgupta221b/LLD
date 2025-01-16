package UML;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}

public class Realization {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(100.0);
    }
}
