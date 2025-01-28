package BehavioralPatterns.TemplateMethodPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();

        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();
    }
}
