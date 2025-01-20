package SOLIDPrinciples.ISP.GoodCode;

public class ScannerPrinter implements Printer,Scanner {
    @Override
    public void print(Document document) {
        System.out.println("Printing document");
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning document");
    }
}
