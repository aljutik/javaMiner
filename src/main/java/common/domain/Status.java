package common.domain;

public class Status {
    private int countOfOpenedFields;
    private boolean isBombOpened;

    public Status() {
    }

    public Status(int countOfOpenedFields, boolean isBombOpened) {
        this.countOfOpenedFields = countOfOpenedFields;
        this.isBombOpened = isBombOpened;
    }

    public Status mergeStatus(Status newStatus) {
        countOfOpenedFields += newStatus.countOfOpenedFields;
        isBombOpened = newStatus.isBombOpened || isBombOpened;
        return this;
    }

    public int getCountOfOpenedFields() {
        return countOfOpenedFields;
    }

    public void setCountOfOpenedFields(int countOfOpenedFields) {
        this.countOfOpenedFields = countOfOpenedFields;
    }

    public boolean isBombOpened() {
        return isBombOpened;
    }

    public void setBombOpened(boolean bombOpened) {
        isBombOpened = bombOpened;
    }
}
