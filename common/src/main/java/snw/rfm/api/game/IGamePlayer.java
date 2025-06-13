package snw.rfm.api.game;

import org.jetbrains.annotations.ApiStatus;

import java.util.Optional;
import java.util.UUID;

@ApiStatus.NonExtendable
public interface IGamePlayer {
    UUID getUuid();

    Optional<? extends IGame> getGame();

    Optional<? extends IGameTeam> getTeam();

    Optional<String> getName();

    Optional<String> getDisplayName();

    boolean isOp();

    void setOp(boolean op);
}
