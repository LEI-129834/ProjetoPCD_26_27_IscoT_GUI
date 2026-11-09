package iscot.events;

import iscot.enums.Areas;
import iscot.enums.Type;
import java.sql.Time;

public abstract class SensorEvent extends Event {
    private double value;

    protected SensorEvent(Areas area, double value){
        super(area);
        this.value = value;
    }

    double getValue(){
        return value;
    }

    @Override
    public String toString() {
        return super.toString() + " [value=" + value + "]";
    }

}
