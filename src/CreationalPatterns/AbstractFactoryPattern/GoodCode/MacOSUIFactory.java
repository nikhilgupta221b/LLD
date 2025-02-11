package CreationalPatterns.AbstractFactoryPattern.GoodCode;

public class MacOSUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacOSScrollBar();
    }
}
