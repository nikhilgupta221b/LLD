package StructuralPatterns.FacadePattern.GoodCode;

public class Gateway {
    private PaymentService paymentService;
    private UserService userService;

    public Gateway() {
        this.paymentService = new PaymentService();
        this.userService = new UserService();
    }

    public String getAllDetails(String cardNo, String userId) {
        String paymentDetails = paymentService.pay(cardNo);
        String userDetails = userService.getUsername(userId);

        return paymentDetails + "\n" + userDetails;
    }
}
