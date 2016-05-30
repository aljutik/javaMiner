package windowsMiner.domain.levels;

import common.domain.Level;

public class ExpertLevel extends Level {
    private static final int COUNT_OF_BOMBS = 99;
    private static final int WIDTH = 16;
    private static final int HEIGHT = 30;

    public ExpertLevel() {
        super(COUNT_OF_BOMBS, WIDTH, HEIGHT);
    }
}
