package BehavioralPatterns.TemplateMethodPattern.GoodCode;

public abstract class DataParser {
    public final void parse() {
        openfile();
        parsefile();
        closefile();
    }
    protected void openfile() {
        System.out.println("Opening file...");
    }

    protected void closefile() {
        System.out.println("Closing file...");
    }

    protected abstract void parsefile();
}
