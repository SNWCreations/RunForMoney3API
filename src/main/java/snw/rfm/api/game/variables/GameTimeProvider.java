package snw.rfm.api.game.variables;

public interface GameTimeProvider {
    // It means no time defined yet,
    // check if the result is this before using the result
    int UNDEFINED = -1;

    int getCurrentGameTime();

    void setCurrentGameTime(int time) throws IllegalArgumentException;

    boolean isTimerLaunched();

    void launchTimer(int time) throws IllegalArgumentException, IllegalStateException;
}
