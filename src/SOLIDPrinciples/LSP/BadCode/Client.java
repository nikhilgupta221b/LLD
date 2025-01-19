package SOLIDPrinciples.LSP.BadCode;

public class Client {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.write();
    }
}
