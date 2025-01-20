package SOLIDPrinciples.ISP.GoodCode;

public class Client {
    public static void main(String[] args) {
        SimplePrinter printer = new SimplePrinter();
        printer.print(new Document());

        ScannerPrinter scannerPrinter = new ScannerPrinter();
        scannerPrinter.print(new Document());
        scannerPrinter.scan(new Document());
    }
}
