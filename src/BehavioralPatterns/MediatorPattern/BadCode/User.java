package BehavioralPatterns.MediatorPattern.BadCode;

public class User {
    private String name;

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message, User receiver) {
        System.out.println("Sent " + message + " to " + receiver.getName());
    }
}
