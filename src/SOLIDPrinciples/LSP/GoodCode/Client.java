package SOLIDPrinciples.LSP.GoodCode;

import java.nio.channels.ReadableByteChannel;

public class Client {
    // Readable Object can be substituted with any of children
    public static void readAnyFile(ReadableFile readableFile){
        readableFile.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        ReadableFile writableFile = new WritableFile();

        readAnyFile(readableFile);
        readAnyFile(writableFile);
    }
}
