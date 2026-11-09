package iscot.events;

import iscot.enums.Areas;

public class AreaVentilationOrderEvent extends HighLevelOrderEvent {
    private boolean activateVentilation;

    public AreaVentilationOrderEvent(Areas area, boolean activateVentilation){
        super(area);
        this.activateVentilation = activateVentilation;
    }

    public boolean getState() {return activateVentilation;}

    @Override 
    public String toString(){
        return "Ordem Ventilação: " + (activateVentilation ? "LIGADO" : "DESLIGADO") + " [Area=" + getArea() + "]";
    }
    
}
