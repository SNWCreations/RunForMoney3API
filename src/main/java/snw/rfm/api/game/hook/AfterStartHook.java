package snw.rfm.api.game.hook;

@FunctionalInterface
public interface AfterStartHook {
    void onStartInitializationFinished();
}
