package common.domain;

public class Field {
    private int positionX;

    private int positionY;

    private FieldMarks mark;

    public Field() {
    }

    public Field(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
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

    public enum FieldMarks {
        Bomb, NotBomb, Unknown, Empty
    }
}
