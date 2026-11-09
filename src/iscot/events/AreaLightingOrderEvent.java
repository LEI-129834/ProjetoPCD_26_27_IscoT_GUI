package iscot.events;

public class AreaLightingOrderEvent extends HighLevelOrderEvent{
    private boolean state;

    public AreaLightingOrderEvent(String deviceId, Area area, boolean state) {
        super(deviceId, area);
        this.state = state;
    }
    public boolean getState() {
        return state;
    }

    @Override
    public String toString() {
        return "AreaLightingOrderEvent{" +
                "deviceId='" + getDeviceId() + '\'' +
                ", area=" + getArea() +
                ", state=" + getState() +
                '}';
    }
    
}
