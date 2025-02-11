package CreationalPatterns.AbstractFactoryPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        // Problems
        // 1 Tight Coupling
        // 2 We can create windows button and mac scroll together which should not be happening.
        WindowsButton windowsButton = new WindowsButton();
        windowsButton.render();
        MacOSScrollBar macOSScrollBar = new MacOSScrollBar();
        macOSScrollBar.scroll();
    }
}
