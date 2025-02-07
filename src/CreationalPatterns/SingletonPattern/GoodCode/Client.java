package CreationalPatterns.SingletonPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        AppSettings appSettings = AppSettings.getInstance();
        AppSettings appSettings2 = AppSettings.getInstance();

        System.out.println(appSettings.getApiKey());
        System.out.println(appSettings2.getApiKey());

        System.out.println(appSettings == appSettings2);
    }
}
