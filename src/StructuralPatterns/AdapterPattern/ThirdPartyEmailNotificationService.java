package StructuralPatterns.AdapterPattern;

public class ThirdPartyEmailNotificationService
{
    // This class doesn't implement send() function because it's provided by 3rd party
    void sendEmail(String to, String title, String content) {
        System.out.println("Sending email to " + to);
        System.out.println("Subject : " + title);
        System.out.println("Content : " + content);
    }
}
