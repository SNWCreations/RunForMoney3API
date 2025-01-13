package snw.rfm.api.game.hook;

@FunctionalInterface
public interface StopHook {
    void onStop(boolean serverStopping);
}
