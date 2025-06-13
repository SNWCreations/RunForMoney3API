package snw.rfm.api.game.hook.global;

import snw.rfm.api.game.IGame;

// Called after the game is registered to game manager
public interface GameStartingHook {
    void handle(IGame game);
}
