package snw.rfm.api.time;

import snw.rfm.api.game.IGamePlayer;

import java.util.Collection;
import java.util.function.Consumer;

public interface ITimerManager {
    ITimer getMainTimer();

    IHunterReleaseTimer getHunterReleaseTimer();

    ITimer createTimer(int initialTime, Collection<? extends IGamePlayer> viewers, String identifier);

    ITimer createTimer(int initialTime, Collection<? extends IGamePlayer> viewers, Consumer<ITimer> onSecondPassed, Consumer<ITimer> onTimeUp, String identifier);
}
