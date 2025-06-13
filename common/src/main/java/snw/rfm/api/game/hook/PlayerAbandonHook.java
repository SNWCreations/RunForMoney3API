package snw.rfm.api.game.hook;

import snw.rfm.api.game.IGamePlayer;

public interface PlayerAbandonHook {
    void handle(IGamePlayer player);
}
