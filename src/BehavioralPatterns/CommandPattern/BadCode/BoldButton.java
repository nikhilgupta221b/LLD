package BehavioralPatterns.CommandPattern.BadCode;

public class BoldButton {
    TextEditor textEditor;

    public BoldButton(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void click() {
        textEditor.bold();
    }
}
