package CreationalPatterns.FactoryPattern.GoodCode;

public class TransportFactory {
    public static Vehicle getTransport(String transportType) {
        switch (transportType.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Not Supported");
        }
    }
}
