package common.domain;

public class Level {

    private int countOfBombs;

    private int width;

    private int height;

    public Level(int countOfBombs, int width, int height) {
        this.countOfBombs = countOfBombs;
        this.width = width;
        this.height = height;
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
