package snw.rfm.api.game.logic.out;

import snw.rfm.api.game.IGamePlayer;

public interface PlayerOutHandler {
    boolean respawn(IGamePlayer who, boolean broadcast);

    boolean queueOut(IGamePlayer who);

    boolean isOutQueued(IGamePlayer who);

    boolean out(IGamePlayer who, boolean broadcast);

    boolean isOut(IGamePlayer who);
}
