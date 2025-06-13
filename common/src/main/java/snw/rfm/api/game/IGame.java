package snw.rfm.api.game;

import org.jetbrains.annotations.ApiStatus;
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

@ApiStatus.NonExtendable
public interface IGame extends Freezable, Tickable {
    void end(Collection<? extends IGamePlayer> winners);

    void stop(boolean serverStopping) throws IllegalStateException;

    boolean containsPlayer(IGamePlayer wrapper);

    boolean addPlayer(IGamePlayer player);

    boolean removePlayer(IGamePlayer player);

    void broadcast(String... what);

    boolean out(IGamePlayer player, boolean broadcast);

    boolean out(IGamePlayer player, boolean broadcast, OutReason reason);

    boolean respawn(IGamePlayer player, boolean broadcast);

    GamePlayerAbilities getPlayerAbilities(IGamePlayer player);

    List<? extends IGamePlayer> getAlivePlayers();

    List<? extends IGamePlayer> getOutPlayers();

    List<? extends IGamePlayer> getAbandonedPlayers();

    Set<? extends IGamePlayer> getPlayersView();

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
