package BehavioralPatterns.TemplateMethodPattern.BadCode;

public class CSVParser {
    public void parse() {
        openfile();
        System.out.println("Parsing CSV file.");
        closefile();
    }

    private void openfile() {
        System.out.println("Opening CSV file");
    }
    private void closefile() {
        System.out.println("Closing CSV file");
    }
}
