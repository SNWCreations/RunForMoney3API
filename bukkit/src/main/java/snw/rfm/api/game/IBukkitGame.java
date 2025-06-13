package snw.rfm.api.game;

import org.bukkit.OfflinePlayer;
import org.bukkit.World;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public interface IBukkitGame extends IGame {
    World getWorld();

    boolean containsPlayer(OfflinePlayer player);

    @Override
    List<IBukkitGamePlayer> getAlivePlayers();

    @Override
    List<IBukkitGamePlayer> getOutPlayers();

    @Override
    List<IBukkitGamePlayer> getAbandonedPlayers();

    @Override
    Set<IBukkitGamePlayer> getPlayersView();

    void doForAllPlayers(Consumer<IBukkitGamePlayer> consumer);

    void doForAllOnlinePlayers(Consumer<IBukkitGamePlayer> consumer);

    void doForAllAlivePlayers(Consumer<IBukkitGamePlayer> consumer);
}
