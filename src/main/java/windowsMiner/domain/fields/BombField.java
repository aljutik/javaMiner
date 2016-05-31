package windowsMiner.domain.fields;

import common.behaviour.Field;
import common.domain.AbstractField;
import common.domain.Status;

public class BombField extends AbstractField implements Field {
    public BombField(int positionX, int positionY) {
        super(positionX, positionY);
    }

    public Status makeAMove() {
        super.makeAMove();
        return new Status(1, true);
    }
}
