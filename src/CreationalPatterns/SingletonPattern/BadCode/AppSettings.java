package CreationalPatterns.SingletonPattern.BadCode;

public class AppSettings {
    private final String dbURL;
    private final String apiKey;

    AppSettings() {
        // reading logic from config file
        this.dbURL = "www.url.comxyz";
        this.apiKey = "key";
    }

    public String getDbURL() {
        return this.dbURL;
    }

    public String getApiKey() {
        return this.apiKey;
    }
}
