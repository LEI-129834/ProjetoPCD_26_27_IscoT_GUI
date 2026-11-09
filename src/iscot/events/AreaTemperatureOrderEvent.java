package iscot.events;

public class AreaTemperatureOrderEvent extends HighLevelOrderEvent {
    private double targetTemperature;

    public AreaTemperatureOrderEvent(String deviceId, Area area, double targetTemperature) {
        super(deviceId, area);
        this.targetTemperature = targetTemperature;
    }

    public double getTemperature() {
        return targetTemperature;
    }

    @Override
    public String toString() {
        return "AreaTemperatureOrderEvent{" +
                "deviceId='" + getDeviceId() + '\'' +
                ", area=" + getArea() +
                ", temperature=" + getTemperature() +
                '}';
    }
    
}
