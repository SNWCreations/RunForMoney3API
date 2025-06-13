package snw.rfm.api.game.mission;

import snw.rfm.api.game.IGamePlayer;

import java.util.Set;

public interface IMission {
    // mutable set
    Set<IGamePlayer> getInvolvedPlayers();

    Set<IGamePlayer> getCompletedPlayers();

    boolean isPlayerCompleted(IGamePlayer who);

    void addCompletedPlayer(IGamePlayer who);

    void startUp();

    void over();
}
