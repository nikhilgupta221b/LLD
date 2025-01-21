package SOLIDPrinciples.DIP.GoodCode;

public class EmailService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("Sending message via Email: " + msg);
    }
}
