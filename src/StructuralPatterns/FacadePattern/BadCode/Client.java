package StructuralPatterns.FacadePattern.BadCode;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        UserService userService = new UserService();

        System.out.println(paymentService.processPayment("12345"));
        System.out.println(userService.getUserName("123"));
        // Issues : Client has to know every thing about every service. So tight coupling.
    }
}
