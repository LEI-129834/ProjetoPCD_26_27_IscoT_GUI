package iscot.events;

import java.awt.geom.Area;

import iscot.enums.Areas;

public class AreaTemperatureOrderEvent extends HighLevelOrderEvent {
    private int targetTemperature;

    public AreaTemperatureOrderEvent(Areas area, int targetTemperature){
        super(area);
        this.targetTemperature = targetTemperature;
    }

    public int getTemperature(){ return targetTemperature; }

    @Override 
    public String toString(){
        return "Temperatura Alvo: " + (targetTemperature) + " [Area=" + getArea() + "]";
    }
    
}
