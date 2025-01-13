package snw.rfm.api.game;

import lombok.NonNull;

import java.util.Optional;
import java.util.function.Consumer;

public interface IGameTeamManager {
    Optional<IGameTeam> getTeam(@NonNull String key);

    IGameTeam registerTeam(@NonNull String key, Consumer<IGamePlayer> onNewPlayer, Consumer<IGamePlayer> onRemovePlayer);
}
