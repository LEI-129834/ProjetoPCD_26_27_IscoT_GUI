package iscot.events;
import iscot.enums.Areas;
import iscot.enums.Type;
import java.sql.Time;

public abstract class Event {

    private final Areas area;

    protected Event(Areas area) {
        this.area = area;
    }

    public Areas getArea() {
        return area;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [area=" + area + "]";
    }
}