package iscot.events;

public class HumiditySensorEvent extends SensorEvent {
    private double humidityLevel;
    
    public HumiditySensorEvent(String deviceId, Area area, double humidityLevel) {
        super(deviceId, area);
        this.humidityLevel = humidityLevel;
    }

    public double getHumidityLevel() {
        return humidityLevel;
    }

    @Override
    public String toString() {
        return "HumiditySensorEvent{" +
                "deviceId='" + getDeviceId() + '\'' +
                ", area=" + getArea() +
                ", humidityLevel=" + humidityLevel +
                '}';
    }
    
}
