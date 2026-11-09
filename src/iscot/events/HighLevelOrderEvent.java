package iscot.events;

import iscot.enums.Areas;
import iscot.enums.Type;

public abstract class HighLevelOrderEvent extends Event{
    Type type = Type.DECIDER;

    public HighLevelOrderEvent(Areas area){
        super(area);
    }
}
