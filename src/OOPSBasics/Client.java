package OOPSBasics;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.addPaymentMethod("NikhilDebitCard", new DebitCard("420", "nikhil101"));
        paymentService.addPaymentMethod("NikhilCreditCard", new CreditCard("420", "nikhil102"));
        paymentService.addPaymentMethod("NikhilUPI", new UPI("nikhil103"));

        paymentService.makePayment("NikhilDebitCard");
        paymentService.makePayment("NikhilCreditCard");
        paymentService.makePayment("NikhilUPI");
    }
}
