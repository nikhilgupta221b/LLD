package BehavioralPatterns.MementoPattern;

import java.util.Stack;

public class EditorCaretaker {

    private final Stack<EditorMemento> history = new Stack<>();

    public void save(Editor editor) {
        history.push(editor.saveState());
    }

    public void undo(Editor editor) {
        if (!history.isEmpty()) {
            history.pop();
            editor.restoreState(history.peek());
        }
    }
}
