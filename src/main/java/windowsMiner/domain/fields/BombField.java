package windowsMiner.domain.fields;

import common.behaviour.Field;
import common.domain.AbstractField;

public class BombField extends AbstractField implements Field {
    public BombField(int positionX, int positionY) {
        super(positionX, positionY);
    }

    public boolean makeAMove() {
        super.makeAMove();
        return false;
    }
}
