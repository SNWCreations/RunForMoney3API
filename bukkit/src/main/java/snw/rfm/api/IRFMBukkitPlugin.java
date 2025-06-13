package snw.rfm.api;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import snw.rfm.api.game.IGamePlayer;

public interface IRFMBukkitPlugin extends IRFMPlugin, Plugin {
    IGamePlayer getGamePlayer(Player player);
}
