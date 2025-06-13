package snw.rfm.api.game;

import lombok.NonNull;
import org.jetbrains.annotations.ApiStatus;

import java.util.Optional;
import java.util.function.Consumer;

@ApiStatus.NonExtendable
public interface IGameTeamManager {
    Optional<IGameTeam> getTeam(@NonNull String key);
}
