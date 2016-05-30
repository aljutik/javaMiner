package common.domain;

public class User {
    private  int  countOfLeftBombs;

    public User() {
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
