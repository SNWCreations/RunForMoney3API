package snw.rfm.api.game.logic.abandon;

import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.interfaces.Disposable;

public interface AbandonHandler extends Disposable {
    // return false if it is impossible to do so
    boolean abandon(IGamePlayer who, boolean force, boolean broadcast);

    // register listeners there
    void register();
}
