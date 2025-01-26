package BehavioralPatterns.MementoPattern;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorCaretaker caretaker = new EditorCaretaker();

        editor.write("Hello World1");
        caretaker.save(editor);
        editor.write("Hello World2");
        caretaker.save(editor);
        editor.write("Hello World3");
        caretaker.save(editor);

        caretaker.undo(editor);
        caretaker.undo(editor);

        System.out.println(editor.getContent());
    }
}
