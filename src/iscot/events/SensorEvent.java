package iscot.events;

public abstract class SensorEvent extends Event {
    
    public SensorEvent(String deviceId, Area area) {
        super(
            deviceId,
            area,
            ClientType.SENSOR
        );
    }
    
}
