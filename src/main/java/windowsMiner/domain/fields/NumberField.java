package windowsMiner.domain.fields;

import common.behaviour.Field;
import common.domain.AbstractField;
import common.domain.Status;

public class NumberField extends AbstractField implements Field {
    private int number;

    public NumberField(int positionX, int positionY) {
        super(positionX, positionY);
        number = 0;
    }

    public Status makeAMove() {
        if (isOpen()) {
            return new Status(0, false);
        }
        super.makeAMove();
        for (Field nearbyField: nearbyFields) {
            if (nearbyField instanceof BombField) {
               number++;
            }
        }
        return new Status(1, false);
    }

    public int getNumber() {
        return this.number;
    }
}
