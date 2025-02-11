package CreationalPatterns.AbstractFactoryPattern.GoodCode;

public class MacOSScrollBar implements ScrollBar {

    @Override
    public void scroll() {
        System.out.println("MacOS ScrollBar");
    }
}
