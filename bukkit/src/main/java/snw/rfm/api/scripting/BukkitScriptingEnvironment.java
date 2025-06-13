package snw.rfm.api.scripting;

import org.bukkit.entity.Player;
import snw.rfm.api.game.IGamePlayer;

public interface BukkitScriptingEnvironment extends ScriptEnvironment<Player> {
    IGamePlayer getGamePlayer(Player handle);
}
