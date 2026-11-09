package iscot.events;

public class TemperatureSensorEvent extends SensorEvent {
    private double temperature;

    public TemperatureSensorEvent(String deviceId, Area area, double temperature) {
        super(deviceId, area);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "TemperatureSensorEvent{" +
                "deviceId='" + getDeviceId() + '\'' +
                ", area=" + getArea() +
                ", temperature=" + temperature +
                '}';
    }
    
}
