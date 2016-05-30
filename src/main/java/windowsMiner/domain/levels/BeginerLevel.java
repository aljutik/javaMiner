package windowsMiner.domain.levels;

import common.domain.Level;

public class BeginerLevel extends Level {
    private static final int COUNT_OF_BOMBS = 10;
    private static final int WIDTH = 9;
    private static final int HEIGHT = 9;

    public BeginerLevel() {
        super(COUNT_OF_BOMBS, WIDTH, HEIGHT);
    }
}
