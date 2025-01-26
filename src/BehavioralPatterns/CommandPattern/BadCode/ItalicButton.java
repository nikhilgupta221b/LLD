package BehavioralPatterns.CommandPattern.BadCode;

public class ItalicButton {
    TextEditor textEditor;

    public ItalicButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        textEditor.italic();
    }
}
