package snw.rfm.api.game;

import org.bukkit.entity.Player;

import java.util.Optional;

public interface IBukkitGamePlayer extends IGamePlayer {
    Optional<Player> getHandle();

    @Override
    Optional<? extends IBukkitGame> getGame();
}
