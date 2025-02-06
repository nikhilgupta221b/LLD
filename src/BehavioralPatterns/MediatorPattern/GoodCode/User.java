package BehavioralPatterns.MediatorPattern.GoodCode;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(String message, User sender) {
        System.out.println(this.name + " Received :" + message + " from " + sender.getName());
    }

    public void sendMessage(String message) {
        chatRoom.sendMessage(message, this);
    }
}
