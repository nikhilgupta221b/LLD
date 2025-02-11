package CreationalPatterns.AbstractFactoryPattern.GoodCode;

public class WindowsScrollBar implements ScrollBar {

    @Override
    public void scroll() {
        System.out.println("Windows Scroll Bar");
    }
}
