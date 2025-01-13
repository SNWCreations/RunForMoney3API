package snw.rfm.api.game.listener;

import org.bukkit.entity.Player;
import snw.rfm.api.game.IGame;
import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.game.IGameTeam;

import java.util.Collection;

public interface GameEventListener {
    IGame getGame();

    // called after necessary initialization
    void onStartInitializationFinished();

    void onInitialHuntersReleased();

    // called in Game#end, before Game#stop(boolean) being called
    void beforeEnd(Collection<IGamePlayer> winners);

    // called before everything being destroyed
    void onStop(boolean serverStopping);

    // return true if the damage is valid (can be regarded as damage caused by hunters)
    boolean onHunterDamagedPlayer(IGamePlayer damager, IGamePlayer damaged);

    void onPlayerReconnect(IGamePlayer player, Player handle);

    void onPlayerDisconnect(IGamePlayer player);

    void onPlayerAdded(IGamePlayer player);

    void onPlayerRemoved(IGamePlayer player);

    void onPlayerCaught(IGamePlayer caught, IGamePlayer hunter);

    // called after player being configured
    void onPlayerJoinedTeam(IGamePlayer who, IGameTeam where);

    // called after player being removed from the team
    void onPlayerLeaveTeam(IGamePlayer who, IGameTeam from);

    void onTimeUp();

    void onAllPlayerOut();

    void onFreezeStateChanged(boolean incoming);
}
