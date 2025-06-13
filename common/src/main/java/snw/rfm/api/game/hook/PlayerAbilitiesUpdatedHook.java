package snw.rfm.api.game.hook;

import snw.rfm.api.game.GamePlayerAbilities;
import snw.rfm.api.game.IGamePlayer;

public interface PlayerAbilitiesUpdatedHook {
    void handle(IGamePlayer dataOwner, GamePlayerAbilities data);
}
