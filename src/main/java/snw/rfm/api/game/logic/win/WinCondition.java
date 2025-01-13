package snw.rfm.api.game.logic.win;

import lombok.NonNull;
import snw.rfm.api.game.IGame;
import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.interfaces.AcceptFreezeStatusTickable;

import java.util.Collection;
import java.util.function.Function;

public interface WinCondition
        extends Function<IGame, @NonNull Collection<IGamePlayer>>, AcceptFreezeStatusTickable {
    // considered for mole
    void onPlayerCaught(IGamePlayer caught, IGamePlayer hunter);

    void onTimeUp(IGame game);
}
