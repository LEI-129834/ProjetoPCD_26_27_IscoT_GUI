package iscot.events;
import java.io.Serializable;

public abstract class Event implements Serializable {
    public enum Area {
        WC,
        BEDROOM,
        LIVING_ROOM,
        KITCHEN,
        GARDEN
    }

    public enum ClientType {
        SENSOR,
        ACTUATOR,
        DECIDER
    }

    private String deviceId;
    public Area area;
    public ClientType clientType;

    public Event(String deviceId, Area area, ClientType clientType) {
        this.deviceId = deviceId;
        this.area = area;
        this.clientType = clientType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public Area getArea() {
        return area;
    }

    public ClientType getClientType() {
        return clientType;
    }

    @Override
    public String toString() {
        return "Event{" +
                "deviceId='" + deviceId + '\'' +
                ", area=" + area +
                ", clientType=" + clientType +
                '}';
    }
}
