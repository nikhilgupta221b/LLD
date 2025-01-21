package SOLIDPrinciples.DIP.GoodCode;

public class NotificationService {
    NotificationChannel notificationChannel;

    NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void notify(String msg) {
        notificationChannel.send(msg);
    }
}
