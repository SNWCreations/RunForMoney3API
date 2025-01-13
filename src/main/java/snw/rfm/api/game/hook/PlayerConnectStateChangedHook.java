package snw.rfm.api.game.hook;

import org.bukkit.entity.Player;
import snw.rfm.api.game.IGamePlayer;

@FunctionalInterface
public interface PlayerConnectStateChangedHook {
    void handle(IGamePlayer player, Player handle);
}
