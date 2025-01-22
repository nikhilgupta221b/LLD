package BehaviouralPatterns.MementoPattern;

public class EditorMemento {
    String content;

    EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
