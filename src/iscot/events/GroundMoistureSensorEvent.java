package iscot.events;

public class GroundMoistureSensorEvent extends SensorEvent {
    private double moistureLevel;
    
    public GroundMoistureSensorEvent(String deviceId, Area area, double moistureLevel) {
        super(deviceId, area);
        this.moistureLevel = moistureLevel;
    }

    public double getMoistureLevel() {
        return moistureLevel;
    }

    @Override
    public String toString() {
        return "GroundMoistureSensorEvent{" +
                "deviceId='" + getDeviceId() + '\'' +
                ", area=" + getArea() +
                ", moistureLevel=" + moistureLevel +
                '}';
    }
    
}
