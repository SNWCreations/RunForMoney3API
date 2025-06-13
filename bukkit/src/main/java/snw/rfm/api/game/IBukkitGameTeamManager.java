package snw.rfm.api.game;

import lombok.NonNull;

import java.util.function.Consumer;

public interface IBukkitGameTeamManager extends IGameTeamManager {
    IGameTeam registerTeam(@NonNull String key, Consumer<IBukkitGamePlayer> onNewPlayer, Consumer<IBukkitGamePlayer> onRemovePlayer);
}
