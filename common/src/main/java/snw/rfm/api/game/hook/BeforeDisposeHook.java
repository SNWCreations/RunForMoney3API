package snw.rfm.api.game.hook;

// this hook is called before the GameHooks holder being disposed
// everything excluding GameHooks is disposed at this time
public interface BeforeDisposeHook {
    void run();
}
