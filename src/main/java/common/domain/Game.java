package common.domain;

public class Game {
    private Field[][] field;

    private Timer timer;

    private int countOfBombs;

    private int width;

    private int height;

    public Game() {
    }

    public Game(int width, int height) {
        this.width = width;
        this.height = height;
        this.field = new Field[width][height];
    }

    public Field[][] getField() {
        return field;
    }

    public void setField(Field[][] field) {
        this.field = field;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public int getCountOfBombs() {
        return countOfBombs;
    }

    public void setCountOfBombs(int countOfBombs) {
        this.countOfBombs = countOfBombs;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
