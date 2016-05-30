package common.domain;

import common.behaviour.Field;

import java.util.List;

public abstract class AbstractField implements Field {

    protected List<Field> nearbyFields;
    private int positionX;

    private int positionY;

    private FieldMarks mark;

    private boolean isOpen;

    public AbstractField(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.isOpen = false;
        this.mark = FieldMarks.Empty;
    }

    public boolean makeAMove() {
        isOpen = true;
        return true;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public FieldMarks getMark() {
        return mark;
    }

    public void setMark(FieldMarks mark) {
        this.mark = mark;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public List<Field> getNearbyFields() {
        return nearbyFields;
    }

    public void setNearbyFields(List<Field> nearbyFields) {
        this.nearbyFields = nearbyFields;
    }

    public enum FieldMarks {
        Bomb, NotBomb, Unknown, Empty
    }
}
