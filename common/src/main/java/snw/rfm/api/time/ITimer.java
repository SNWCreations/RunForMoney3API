package snw.rfm.api.time;

import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.UnmodifiableView;
import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.interfaces.Freezable;

import java.util.Set;

public interface ITimer extends Freezable {
    int getRemainingTime();

    void setRemainingTime(@Range(from = 0, to = Integer.MAX_VALUE) int time);

    int getTPS();

    void setTPS(@Range(from = 1, to = Integer.MAX_VALUE) int tps);

    Status getStatus();

    void scheduleStart(int delayTicks) throws IllegalStateException;

    void immediateStart() throws IllegalStateException;

    @UnmodifiableView
    Set<? extends IGamePlayer> getViewers();

    // Add the given player to this timer, the player will be removed from its viewing timer before adding.
    void addViewer(IGamePlayer viewer);

    void removeViewer(IGamePlayer viewer);

    void clearViewers();

    @Override
    default boolean isFrozen() {
        return getStatus() == Status.PAUSED;
    }

    String getIdentifier();

    enum Status {
        INACTIVE,
        SCHEDULED_TO_START,
        RUNNING,
        PAUSED
    }
}
