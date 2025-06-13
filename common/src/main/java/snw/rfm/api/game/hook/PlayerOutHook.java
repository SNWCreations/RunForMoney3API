package snw.rfm.api.game.hook;

import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.game.logic.out.OutReason;

public interface PlayerOutHook {
    @Deprecated
    default void onPlayerOut(IGamePlayer who) {
        onPlayerOut(who, OutReason.CAUGHT);
    }

    void onPlayerOut(IGamePlayer who, OutReason reason);
}
