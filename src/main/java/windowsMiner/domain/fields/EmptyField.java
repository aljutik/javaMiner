package windowsMiner.domain.fields;

import common.behaviour.Field;
import common.domain.AbstractField;
import common.domain.Status;

public class EmptyField extends AbstractField implements Field {
    public EmptyField(int positionX, int positionY) {
        super(positionX, positionY);
    }

    @Override
    public Status makeAMove() {
        if (isOpen()) {
            return new Status(0, false);
        }
        Status status = super.makeAMove();
        for(Field nearbyField : nearbyFields) {
            status.mergeStatus(nearbyField.makeAMove());
        }
        return status;
    }
}
