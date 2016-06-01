package windowsMiner;

import common.behaviour.Field;
import windowsMiner.domain.WindowsGame;
import windowsMiner.domain.levels.BeginnerLevel;

import java.util.Random;

public class WindowsMiner {

    public static void main(String [] args) {
        WindowsGame game = new WindowsGame(new BeginnerLevel());
        game.start();
        Field[][] gameField = game.getField();
        Random random = new Random();
        while (!game.isGameOver()) {
            int row = random.nextInt(game.getLevel().getWidth());
            int column = random.nextInt(game.getLevel().getHeight());
            game.makeAMove(gameField[row][column]);
        }
        game.stop();
        if (game.getStatus().isBombOpened()) {
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }
        System.out.printf("You opened %d fields.", game.getStatus().getCountOfOpenedFields());
    }
}
