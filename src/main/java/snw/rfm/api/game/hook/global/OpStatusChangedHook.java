package snw.rfm.api.game.hook.global;

import snw.rfm.api.game.IGamePlayer;

public interface OpStatusChangedHook {
    void handle(IGamePlayer player, boolean newState);
}
