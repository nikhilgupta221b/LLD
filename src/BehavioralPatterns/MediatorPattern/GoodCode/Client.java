package BehavioralPatterns.MediatorPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User john = new User("John", chatRoom);
        User jane = new User("Jane", chatRoom);
        User nikhil = new User("Nikhil", chatRoom);

        chatRoom.addUser(jane);
        chatRoom.addUser(john);
        chatRoom.addUser(nikhil);

        nikhil.sendMessage("Hi Everyone! How are you?");
    }
}
