package CreationalPatterns.FactoryPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        Vehicle car = TransportFactory.getTransport("Bike");
        car.deliver();
    }
}
