package BehaviouralPatterns.MementoPattern;

import java.util.Stack;

public class EditorCaretaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void saveHistory(Editor editor) {
        history.push(editor.save());
    }

    public void restoreHistory(Editor editor) {
        if (!history.isEmpty()) {
            history.pop();
            editor.restore(history.peek());
        }
    }
}
