package SOLIDPrinciples.LSP.BadCode;

public class ReadOnlyFile extends File{
    @Override
    public void write() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
