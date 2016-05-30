package common.domain;

public class Field {
    FieldMarks mark;

    public Field() {
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
