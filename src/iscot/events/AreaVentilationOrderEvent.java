package iscot.events;

public class AreaVentilationOrderEvent extends HighLevelOrderEvent{
    public enum VentilationState {
        OFF,
        VENTILATION,
        HEATING,
        COOLING
    }

    private VentilationState ventilationState;

    public AreaVentilationOrderEvent(String deviceId, Area area, VentilationState ventilationState) {
        super(deviceId, area);
        this.ventilationState = ventilationState;
    }
    public VentilationState getState() {
        return ventilationState;
    }

    @Override
    public String toString() {
        return "AreaVentilationOrderEvent{" +
                "deviceId='" + getDeviceId() + '\'' +
                ", area=" + getArea() +
                ", state=" + getState() +
                '}';
    }
    
}
