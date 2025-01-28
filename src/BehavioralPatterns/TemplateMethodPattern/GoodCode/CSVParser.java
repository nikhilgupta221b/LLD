package BehavioralPatterns.TemplateMethodPattern.GoodCode;

public class CSVParser extends DataParser {
    @Override
    protected void parsefile() {
        System.out.println("Parsing CSV file...");
    }
}
