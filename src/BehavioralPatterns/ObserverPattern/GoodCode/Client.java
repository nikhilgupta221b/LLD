package BehavioralPatterns.ObserverPattern.GoodCode;

public class Client {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        MobileDevice mobileDevice = new MobileDevice();
        DisplayDevice displayDevice = new DisplayDevice();

        station.attachObserver(displayDevice);
        station.attachObserver(mobileDevice);

        station.updateTemperature(27);

        station.detachObserver(displayDevice);

        station.updateTemperature(30);
    }
}
