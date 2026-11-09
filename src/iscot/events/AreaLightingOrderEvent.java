package iscot.events;

import iscot.enums.Areas;

public class AreaLightingOrderEvent extends HighLevelOrderEvent {
    private boolean turnOn;

    public AreaLightingOrderEvent(Areas Area, boolean turnOn){
        super(Area);
        this.turnOn = turnOn;
    }

    public boolean getState() {return turnOn;}

    @Override 
    public String toString(){
        return "Ordem Iluminação: " + (turnOn ? "LIGADO" : "DESLIGADO") + " [Area=" + getArea() + "]";
    }
    
}
