package SOLIDPrinciples.ISP.BadCode;

public class ScannerPrinter implements Machine{
    @Override
    public void print(Document document) {
        System.out.println("Printing...");
    }

    @Override
    public void copy(Document document) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning...");
    }
}
