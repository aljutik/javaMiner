package common.domain;

public class Timer {
    private int seconds;

    public Timer() {
        seconds = 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void increaseTimer() {
        seconds++;
    }
}
