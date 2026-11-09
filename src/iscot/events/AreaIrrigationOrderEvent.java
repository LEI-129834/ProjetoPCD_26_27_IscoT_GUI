package iscot.events;

public class AreaIrrigationOrderEvent extends HighLevelOrderEvent{
    private boolean state;

    public AreaIrrigationOrderEvent(String deviceId, Area area, boolean state) {
        super(deviceId, area);
        this.state = state;
    }
    public boolean getState() {
        return state;
    }

    @Override
    public String toString() {
        return "AreaIrrigationOrderEvent{" +
                "deviceId='" + getDeviceId() + '\'' +
                ", area=" + getArea() +
                ", state=" + getState() +
                '}';
    }
    
}
