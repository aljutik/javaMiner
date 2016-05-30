package windowsMiner.domain.fields;

import common.behaviour.Field;
import common.domain.AbstractField;

public class NumberField extends AbstractField implements Field {
    private int number;

    public NumberField(int positionX, int positionY) {
        super(positionX, positionY);
        number = 0;
    }

    public boolean makeAMove() {
        super.makeAMove();
        for (Field nearbyField: nearbyFields) {
            if (nearbyField instanceof BombField) {
               number++;
            }
        }
        return true;
    }

    public int getNumber() {
        return this.number;
    }
}
