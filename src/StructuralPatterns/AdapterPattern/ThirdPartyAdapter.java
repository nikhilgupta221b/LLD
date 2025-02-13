package StructuralPatterns.AdapterPattern;

public class ThirdPartyAdapter implements NotificationService{
    ThirdPartyEmailNotificationService emailNotificationService;

    public ThirdPartyAdapter(ThirdPartyEmailNotificationService emailNotificationService) {
        this.emailNotificationService = emailNotificationService;
    }

    @Override
    public void send(String to, String subject, String body) {
        emailNotificationService.sendEmail(to, subject, body);
    }
}
