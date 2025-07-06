package snw.rfm.api.game.variables;

/**
 * @deprecated Use {@link snw.rfm.api.time.ITimerManager} instead
 */
@Deprecated
public interface GameTimeProvider {
    // It means no time defined yet,
    // check if the result is this before using the result
    int UNDEFINED = -1;

    int getCurrentGameTime();

    void setCurrentGameTime(int time) throws IllegalArgumentException;

    boolean isTimerPaused();

    void setTimerPaused(boolean newValue);

    boolean isTimerLaunched();

    void launchTimer(int time) throws IllegalArgumentException, IllegalStateException;
}
