package BehavioralPatterns.ObserverPattern.BadCode;

public class WeatherStation {
    private float temperature;
    MobileDevice device;

    WeatherStation() {
        device = new MobileDevice();
    }

    public void updateTemperature(float temperature) {
        this.temperature = temperature;
        notifyDevices();
    }

    public void notifyDevices() {
        device.update(temperature);
    }
}
