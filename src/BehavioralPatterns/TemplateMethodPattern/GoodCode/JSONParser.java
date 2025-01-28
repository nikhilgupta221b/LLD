package BehavioralPatterns.TemplateMethodPattern.GoodCode;

public class JSONParser extends DataParser {
    @Override
    protected void parsefile() {
        System.out.println("Parsing JSON file...");
    }
}
