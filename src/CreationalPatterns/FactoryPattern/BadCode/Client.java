package CreationalPatterns.FactoryPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        // Problem : Client is tightly coupled with classes.
        // Task of object creation should be removed from client.
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.deliver();
        bike.deliver();
    }
}
