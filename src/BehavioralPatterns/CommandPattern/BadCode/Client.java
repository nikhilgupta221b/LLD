package BehavioralPatterns.CommandPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        BoldButton boldButton = new BoldButton(textEditor);
        boldButton.click();

        ItalicButton italicButton = new ItalicButton(textEditor);
        italicButton.click();
    }
}
