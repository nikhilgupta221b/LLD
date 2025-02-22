package StructuralPatterns.FacadePattern.GoodCode;

public class PaymentService {
    public String pay(String cardNo) {
        return "Payment via card number " + cardNo;
    }
}
