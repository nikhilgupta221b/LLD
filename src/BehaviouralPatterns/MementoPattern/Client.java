package BehaviouralPatterns.MementoPattern;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Hello World1");
        editor.save();
        editor.write("Hello World2");
        editor.save();
        editor.write("Hello World3");
        editor.save();
        editor.undo();
        editor.undo();
        System.out.println(editor.getContent());
    }
}
