package snw.rfm.api.game.hook;

import snw.rfm.api.game.IGamePlayer;

@FunctionalInterface
public interface PlayerConnectStateChangedHook {
    void handle(IGamePlayer player);
}
