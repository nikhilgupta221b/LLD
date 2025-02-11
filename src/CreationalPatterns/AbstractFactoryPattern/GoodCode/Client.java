package CreationalPatterns.AbstractFactoryPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        Application application = new Application(new MacOSUIFactory());
        application.renderUI();
    }
}
