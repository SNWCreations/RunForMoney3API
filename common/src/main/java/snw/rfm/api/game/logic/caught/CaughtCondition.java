package snw.rfm.api.game.logic.caught;

import snw.rfm.api.game.IGamePlayer;

import java.util.function.BiPredicate;

public interface CaughtCondition {

    boolean caught(IGamePlayer target, IGamePlayer hunter);

    default BiPredicate<IGamePlayer, IGamePlayer> asBiPredicate() {
        return this::caught;
    }

}
