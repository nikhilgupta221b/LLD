package OOPSBasics;

import java.util.HashMap;

public class PaymentService {
    HashMap<String, PaymentMethods> paymentMethods;

    PaymentService() {
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String paymentMethodName, PaymentMethods paymentMethod) {
        paymentMethods.put(paymentMethodName, paymentMethod);
    }

    public void makePayment(String paymentMethodName) {
        PaymentMethods paymentMethod = paymentMethods.get(paymentMethodName);
        paymentMethod.pay();
    }
}
