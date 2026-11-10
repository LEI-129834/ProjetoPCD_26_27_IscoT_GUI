package iscot.events;

import java.awt.geom.Area;

import iscot.enums.Areas;
import iscot.enums.AirConditioningMode;

public class AreaTemperatureOrderEvent extends HighLevelOrderEvent {
    private AirConditioningMode acMode;

    public AreaTemperatureOrderEvent(Areas area, AirConditioningMode acMode){
        super(area);
        this.acMode = acMode;
    }

    public AirConditioningMode getMode(){ return acMode; }

    @Override 
    public String toString(){
        return "Temperatura Alvo: " + (acMode) + " [Area=" + getArea() + "]";
    }
    
}
