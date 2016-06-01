package common.domain;

import common.behaviour.Field;
import common.behaviour.Game;

public abstract class AbstractGame implements Game {
    protected Field[][] field;

    protected Level level;
    protected Status status;
    private int countOfLeftBombs;
    private int countOfNotBombField;

    public AbstractGame(Level level) {
        this.level = level;
        this.field = new Field[level.getWidth()][level.getHeight()];
        this.countOfLeftBombs = level.getCountOfBombs();
        this.countOfNotBombField = level.getWidth() * level.getHeight() - level.getCountOfBombs();
        this.status = new Status(0, false);
    }

    public Field[][] getField() {
        return field;
    }

    public Level getLevel() {
        return level;
    }

    public Status getStatus() {
        return status;
    }

    public int getCountOfLeftBombs() {
        return countOfLeftBombs;
    }

    protected void increaseCountOfLeftBombs() {
        countOfLeftBombs++;
    }

    protected void decreaseCountOfLeftBombs() {
        countOfLeftBombs--;
    }

    public boolean isGameOver() {
        if (status.isBombOpened() ||
                (!status.isBombOpened() && status.getCountOfOpenedFields() == countOfNotBombField)) {
            return true;
        }
        return false;
    }
}
