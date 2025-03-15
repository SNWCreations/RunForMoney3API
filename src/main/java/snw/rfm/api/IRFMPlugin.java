package snw.rfm.api;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import snw.rfm.api.game.IGamePlayer;

import java.util.UUID;

public interface IRFMPlugin extends Plugin {
    boolean isDisabling();

    IGamePlayer getGamePlayer(Player player);

    IGamePlayer getGamePlayer(UUID uuid);
}
