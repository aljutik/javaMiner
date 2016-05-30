package common.domain;

import common.behaviour.Field;

public class Game {
    protected Field[][] field;

    protected Level level;

    private int countOfLeftBombs;

    public Game() {
    }

    public Game(Level level) {
        this.level = level;
        this.field = new Field[level.getWidth()][level.getHeight()];
        this.countOfLeftBombs = level.getCountOfBombs();
    }

    public Field[][] getField() {
        return field;
    }

    public int getCountOfLeftBombs() {
        return countOfLeftBombs;
    }

    public void setCountOfLeftBombs(int countOfLeftBombs) {
        this.countOfLeftBombs = countOfLeftBombs;
    }

    public void decreaseCountOfLeftBombs() {
        countOfLeftBombs--;
    }
}
