package StructuralPatterns.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        NotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.send("nikhil@gmail.com", "Subject", "This is an email notification.");

        // Problems: If we want to implement Some other service for sending email, it might not
        // have same send method. We need to modify send function in all codebase.

        NotificationService thirdPartyService = new ThirdPartyAdapter(new ThirdPartyEmailNotificationService());
        thirdPartyService.send("nikhil@gmail.com", "Subject", "This is an email notification.");

    }
}
