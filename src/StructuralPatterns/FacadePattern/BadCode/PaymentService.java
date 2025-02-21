package StructuralPatterns.FacadePattern.BadCode;

public class PaymentService {
    public String processPayment(String cardNumber) {
        return "Processing payment for " + cardNumber;
    }
}
