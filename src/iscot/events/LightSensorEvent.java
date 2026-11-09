package iscot.events;

public class LightSensorEvent extends SensorEvent {
    private double lightLevel;
    
    public LightSensorEvent(String deviceId, Area area, double lightLevel) {
        super(deviceId, area);
        this.lightLevel = lightLevel;
    }

    public double getLightLevel() {
        return lightLevel;
    }

    @Override
    public String toString() {
        return "LightSensorEvent{" +
                "deviceId='" + getDeviceId() + '\'' +
                ", area=" + getArea() +
                ", lightLevel=" + lightLevel +
                '}';
    }
    
}
