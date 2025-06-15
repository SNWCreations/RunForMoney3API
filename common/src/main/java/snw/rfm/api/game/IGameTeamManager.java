package snw.rfm.api.game;

import lombok.NonNull;
import org.jetbrains.annotations.ApiStatus;

import java.util.Optional;

@ApiStatus.NonExtendable
public interface IGameTeamManager {
    Optional<IGameTeam> getTeam(@NonNull String key);
}
