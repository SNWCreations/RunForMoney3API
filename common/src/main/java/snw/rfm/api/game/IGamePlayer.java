package snw.rfm.api.game;

import org.jetbrains.annotations.ApiStatus;
import snw.rfm.api.game.teaming.GamePlayerGroup;

import java.util.Optional;
import java.util.UUID;

@ApiStatus.NonExtendable
public interface IGamePlayer {
    UUID getUuid();

    Optional<? extends IGame> getGame();

    Optional<? extends IGameTeam> getTeam();

    Optional<? extends GamePlayerGroup> getGroup();

    // Empty optional is returned if the player is not in any game
    Optional<? extends GamePlayerAbilities> getAbilities();

    Optional<String> getName();

    Optional<String> getDisplayName();

    boolean isOp();

    void setOp(boolean op);
}
