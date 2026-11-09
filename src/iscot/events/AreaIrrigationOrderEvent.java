package iscot.events;

import iscot.enums.Areas;

public class AreaIrrigationOrderEvent extends HighLevelOrderEvent {
    private boolean activateIrrigation;

    public AreaIrrigationOrderEvent(Areas area, boolean activateIrrigation){
        super(area);
        this.activateIrrigation = activateIrrigation;
    }

    public boolean getState() {return activateIrrigation;}

    @Override 
    public String toString(){
        return "Ordem de Rega: " + (activateIrrigation ? "LIGADO" : "DESLIGADO") + " [Area=" + getArea() + "]";
    }

    
}
