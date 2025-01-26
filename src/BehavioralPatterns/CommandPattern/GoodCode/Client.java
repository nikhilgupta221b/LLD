package BehavioralPatterns.CommandPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Button button = new Button(new BoldCommand(textEditor));
        button.click();

        Button button2 = new Button(new ItalicCommand(textEditor));
        button2.click();
    }
}
