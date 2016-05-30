package common.behaviour;

import common.domain.AbstractField;

public interface GameMethods {
    public void start();

    public void stop();

    public void setBombs();

    public void makeAMove(Field field);

    public void setMark(Field field);
}
