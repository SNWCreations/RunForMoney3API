package snw.rfm.api.game.hook;

import snw.rfm.api.game.IGamePlayer;

@FunctionalInterface
public interface PlayerCaughtHook {
    void onPlayerCaught(IGamePlayer caught, IGamePlayer hunter);
}
