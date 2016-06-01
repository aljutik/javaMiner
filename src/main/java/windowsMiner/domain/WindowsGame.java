package windowsMiner.domain;

import common.behaviour.Field;
import common.behaviour.Game;
import common.domain.AbstractGame;
import common.domain.Level;
import common.domain.Status;
import common.enums.FieldMarks;
import windowsMiner.domain.fields.BombField;
import windowsMiner.domain.fields.EmptyField;
import windowsMiner.domain.fields.NumberField;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WindowsGame extends AbstractGame implements Game {
    public WindowsGame(Level level) {
        super(level);
    }

    public void start() {
        for (int posX = 0; posX < level.getWidth(); posX++) {
            for (int posY = 0; posY < level.getHeight(); posY++) {
                    field[posX][posY] = new EmptyField(posX, posY);
            }
        }

        setBombs();

        for (int posX = 0; posX < level.getWidth(); posX++) {
            for (int posY = 0; posY < level.getHeight(); posY++) {
                field[posX][posY].setNearbyFields(getNearbyFields(field[posX][posY]));
            }
        }
    }

    public void stop() {

    }

    public void setBombs() {
        int maxCountOfBombs = level.getCountOfBombs();
        int countOfSetBomb = 0;
        Random random = new Random();
        while (countOfSetBomb < maxCountOfBombs) {
            int row = random.nextInt(level.getWidth());
            int column = random.nextInt(level.getHeight());
            if (!(field[row][column] instanceof BombField)) {
                field[row][column] = new BombField(row, column);
                countOfSetBomb++;
                for (Field nearbyField : getNearbyFields(field[row][column])) {
                    if (nearbyField instanceof EmptyField) {
                        field[nearbyField.getPositionX()][nearbyField.getPositionY()] =
                                new NumberField(nearbyField.getPositionX(), nearbyField.getPositionY());
                    }
                }
            }
        }
    }

    public Status makeAMove(Field field) {
        return status.mergeStatus(field.makeAMove());
    }

    public void setMark(Field field) {
        switch(field.getMark()) {
            case Bomb:
                field.setMark(FieldMarks.NotBomb);
                increaseCountOfLeftBombs();
                break;
            case NotBomb:
                field.setMark(FieldMarks.Unknown);
                break;
            case Unknown:
                field.setMark(FieldMarks.Empty);
                break;
            case Empty:
                field.setMark(FieldMarks.Bomb);
                decreaseCountOfLeftBombs();
                break;
        }
    }

    private List<Field> getNearbyFields(Field currentField) {
        List<Field> nearbyFields = new ArrayList<Field>();

        int currentX = currentField.getPositionX();
        int currentY = currentField.getPositionY();

        int minX = 0;
        if (currentX - 1 > minX) {
            minX = currentX - 1;
        }

        int maxX = level.getWidth() - 1;
        if (currentX + 1 < maxX) {
            maxX = currentX + 1;
        }

        int minY = 0;
        if (currentY - 1 > minY) {
            minY = currentY - 1;
        }

        int maxY = level.getHeight() - 1;
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
