package snw.rfm.api.game.variables;

import java.util.concurrent.atomic.AtomicInteger;

public interface GameTimeProvider {
    // It means no time defined yet,
    // check if the result is this before using the result
    int UNDEFINED = -1;

    AtomicInteger getGameTime();

    boolean isTimerLaunched();

    void launchTimer(int time) throws IllegalArgumentException, IllegalStateException;
}
