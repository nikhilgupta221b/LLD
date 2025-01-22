package BehaviouralPatterns.MementoPattern;

public class Editor {

    String content;

    public void write(String text) {
        content = text;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento saveState() {
        return new EditorMemento(content);
    }

    public void restoreState(EditorMemento memento) {
        content = memento.getContent();
    }
}
