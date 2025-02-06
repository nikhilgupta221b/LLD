package BehavioralPatterns.MediatorPattern.GoodCode;

public interface ChatMediator {
    public void addUser(User user);
    public void sendMessage(String message, User sender);
}
