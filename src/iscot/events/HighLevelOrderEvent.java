package iscot.events;

public abstract class HighLevelOrderEvent extends Event {
    public HighLevelOrderEvent(String deviceId, Area area) {
        super(
            deviceId, 
            area, 
            ClientType.DECIDER
        );
    }
}
