package snw.rfm.api.game.logic.common;

import snw.rfm.api.game.IGame;

public interface HunterInitializer {
    IGame getGame();

    void onStartInitializationFinished();

    void doRelease();
}
