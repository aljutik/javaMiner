package windowsMiner.domain;

import common.behaviour.Field;
import common.behaviour.GameMethods;
import common.domain.AbstractField;
import common.domain.Game;

import java.util.ArrayList;
import java.util.List;

public class WindowsGame extends Game implements GameMethods {
    public WindowsGame() {

    }

    public void start() {

    }

    public void stop() {

    }

    public void setBombs() {

    }

    public void makeAMove(Field field) {

    }

    public void setMark(Field field) {

    }

    public List<AbstractField> getNearbyFields(AbstractField currentField) {
        List<AbstractField> nearbyFields = new ArrayList<AbstractField>();

        int currentX = currentField.getPositionX();
        int currentY = currentField.getPositionY();

        int minX = 0;
        if (currentX - 1 > minX) {
            minX = currentX - 1;
        }

        int maxX = getWidth() - 1;
        if (currentX + 1 < maxX) {
            maxX = currentX + 1;
        }

        int minY = 0;
        if (currentY - 1 > minY) {
            minY = currentY - 1;
        }

        int maxY = getWidth() - 1;
        if (currentY + 1 < maxY) {
            maxY = currentY + 1;
        }

        for (int posX = minX; posX <= maxX; posX++) {
            for (int posY = minY; posY <= maxY; posY++) {
                if ((posX != currentX) && (posY != currentY)) {
                    nearbyFields.add(field[posX][posY]);
                }
            }
        }

        return nearbyFields;
    }
}
