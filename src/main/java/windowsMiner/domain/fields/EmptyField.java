package windowsMiner.domain.fields;

import common.behaviour.Field;
import common.domain.AbstractField;

public class EmptyField extends AbstractField implements Field {
    public EmptyField(int positionX, int positionY) {
        super(positionX, positionY);
    }
}
