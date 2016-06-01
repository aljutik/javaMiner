package common.behaviour;

import common.domain.Level;
import common.domain.Status;

public interface Game {
    void start();

    void stop();

    void setBombs();

    Status makeAMove(Field field);

    void setMark(Field field);

    Level getLevel();

    boolean isGameOver();
}
