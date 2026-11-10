package iscot.events;

import iscot.enums.Areas;
import iscot.enums.Type;

public abstract class HighLevelOrderEvent extends Event{
    public Type getType(){return Type.DECIDER;}

    public HighLevelOrderEvent(Areas area){
        super(area);
    }
}
