package BehavioralPatterns.MediatorPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        User john = new User("John Doe");
        User jane = new User("Jane Doe");
        User nikhil = new User("Nikhil");

        nikhil.sendMessage("Hi Everyone!", john);
        nikhil.sendMessage("Hi Everyone!", jane);
    }
}
