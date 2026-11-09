package iscot.events;
import java.time.Instant;

public abstract class Event {
    private final Instant timestamp;
    private final String area;

    public Event(Instant timestamp, String area) {
        this.timestamp = timestamp;
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
