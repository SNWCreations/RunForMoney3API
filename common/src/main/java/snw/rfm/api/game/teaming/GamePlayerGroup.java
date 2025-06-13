package snw.rfm.api.game.teaming;

import snw.rfm.api.interfaces.Disposable;

public interface GamePlayerGroup extends GamePlayerCategory, Disposable {
    void clear();
}
