package BehavioralPatterns.CommandPattern.GoodCode;

public class BoldCommand implements Command {
    TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.bold();
    }
}
