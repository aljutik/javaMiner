package windowsMiner.domain.levels;

import common.domain.Level;

public class MiddleLevel extends Level{
    private static final int COUNT_OF_BOMBS = 40;
    private static final int WIDTH = 16;
    private static final int HEIGHT = 16;

    public MiddleLevel() {
        super(COUNT_OF_BOMBS, WIDTH, HEIGHT);
    }
}
