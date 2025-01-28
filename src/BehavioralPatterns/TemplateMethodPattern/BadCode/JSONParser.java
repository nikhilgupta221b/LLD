package BehavioralPatterns.TemplateMethodPattern.BadCode;

public class JSONParser {
    public void parse() {
        openfile();
        System.out.println("Parsing JSON file.");
        closefile();
    }

    private void openfile() {
        System.out.println("Opening JSON file.");
    }
    private void closefile() {
        System.out.println("Closing JSON file.");
    }
}
