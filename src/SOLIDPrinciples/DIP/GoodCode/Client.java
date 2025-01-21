package SOLIDPrinciples.DIP.GoodCode;

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new SMSService());
        notificationService.notify("Order Placed Successfully.");

        NotificationService notificationService2 = new NotificationService(new EmailService());
        notificationService2.notify("Order Returned Successfully.");
    }
}
