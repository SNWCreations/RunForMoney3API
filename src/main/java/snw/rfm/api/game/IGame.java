package snw.rfm.api.game;

import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import snw.rfm.api.game.extra.ExtraObjectStorage;
import snw.rfm.api.game.hook.GameHooks;
import snw.rfm.api.game.listener.GameEventListener;
import snw.rfm.api.game.logic.IGameLogicSet;
import snw.rfm.api.game.logic.abandon.AbandonHandler;
import snw.rfm.api.game.logic.out.OutReason;
import snw.rfm.api.game.mission.IMissionManager;
import snw.rfm.api.game.stat.IGameStatManager;
import snw.rfm.api.game.variables.GameVariables;
import snw.rfm.api.interfaces.Freezable;
import snw.rfm.api.interfaces.Tickable;
import snw.rfm.api.task.ITaskManager;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public interface IGame extends Freezable, Tickable {
    void end(Collection<IGamePlayer> winners);

    void stop(boolean serverStopping) throws IllegalStateException;

    boolean containsPlayer(OfflinePlayer player);

    boolean containsPlayer(IGamePlayer wrapper);

    boolean addPlayer(IGamePlayer player);

    boolean removePlayer(IGamePlayer player);

    void doForAllPlayers(Consumer<IGamePlayer> consumer);

    void doForAllOnlinePlayers(Consumer<IGamePlayer> consumer);

    void doForAllAlivePlayers(Consumer<IGamePlayer> consumer);

    void broadcast(String... what);

    boolean out(IGamePlayer player, boolean broadcast);

    boolean out(IGamePlayer player, boolean broadcast, OutReason reason);

    boolean respawn(IGamePlayer player, boolean broadcast);

    GamePlayerAbilities getPlayerAbilities(IGamePlayer player);

    List<IGamePlayer> getAlivePlayers();

    List<IGamePlayer> getOutPlayers();

    List<IGamePlayer> getAbandonedPlayers();

    World getWorld();

    Set<IGamePlayer> getPlayersView();

    IGameTeamManager getTeamManager();

    ITaskManager getTaskManager();

    GameEventListener getEventListener();

    ExtraObjectStorage getExtraObjectStorage();

    AbandonHandler getAbandonHandler();

    GameVariables getVariables();

    IGameLogicSet getLogicSet();

    IGameStatManager getStatManager();

    GameHooks getHooks();

    IMissionManager getMissionManager();
}
