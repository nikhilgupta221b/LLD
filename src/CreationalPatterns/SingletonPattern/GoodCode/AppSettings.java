package CreationalPatterns.SingletonPattern.GoodCode;

public class AppSettings {
    // Step 1: make a static variable called instance
    private static AppSettings instance;

    private final String dbUrl;
    private final String apiKey;

    // Step 2: Make constructor private so it can't be accessed directly
    private AppSettings() {
        // Reading from file logic
        dbUrl = "jdbc:mysql://localhost:3306/";
        apiKey = "abcdefghijklmnopqrstuvwxyz";
    }

    // Step 3: Provide a static method to create instance if not already exits
    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
