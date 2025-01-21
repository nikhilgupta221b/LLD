package SOLIDPrinciples.DIP.GoodCode;

public class SMSService implements NotificationChannel{

    @Override
    public void send(String msg) {
        System.out.println("Sending message via SMS: " + msg);
    }
}
