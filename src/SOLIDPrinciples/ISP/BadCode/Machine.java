package SOLIDPrinciples.ISP.BadCode;

public interface Machine {
    void print(Document document);
    void copy(Document document);
    void scan(Document document);
}
