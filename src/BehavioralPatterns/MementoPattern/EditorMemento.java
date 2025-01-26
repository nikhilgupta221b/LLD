package BehavioralPatterns.MementoPattern;

public class EditorMemento {
    String content;

    EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
