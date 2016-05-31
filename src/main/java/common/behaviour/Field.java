package common.behaviour;

import common.domain.Status;
import common.enums.FieldMarks;

import java.util.List;

public interface Field {
    Status makeAMove();

    int getPositionX();

    int getPositionY();

    FieldMarks getMark();

    void setMark(FieldMarks mark);

    void setNearbyFields(List<Field> nearbyFields);
}
