package BehavioralPatterns.ObserverPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.updateTemperature(25);
        station.updateTemperature(30);
    }
}
