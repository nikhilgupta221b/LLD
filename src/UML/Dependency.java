package UML;

class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Printer {
    public void print(Document doc) {
        System.out.println("Printing Document: " + doc.getContent());
    }
}

public class Dependency {
    public static void main(String[] args) {
        Document doc = new Document("Hello World");
        Printer printer = new Printer();
        printer.print(doc);
    }
}
