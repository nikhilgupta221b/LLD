package CreationalPatterns.AbstractFactoryPattern.GoodCode;

public class Application {
    private final Button button;
    private final ScrollBar scrollBar;

    Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.scrollBar = uiFactory.createScrollBar();
    }

    public void renderUI() {
        button.render();
        scrollBar.scroll();
    }
}
