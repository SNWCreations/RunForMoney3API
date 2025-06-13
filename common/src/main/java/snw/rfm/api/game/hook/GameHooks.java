package snw.rfm.api.game.hook;

import snw.rfm.api.interfaces.Disposable;
import snw.rfm.api.util.hook.Hook;

public final class GameHooks implements Disposable {
    public final Hook<AfterStartHook> afterStart;
    public final Hook<StopHook> onStop;
    public final Hook<PlayerConnectStateChangedHook> onPlayerReconnect;
    public final Hook<PlayerConnectStateChangedHook> onPlayerDisconnect;
    public final Hook<PlayerCaughtHook> onPlayerCaught;
    public final Hook<PlayerAbandonHook> onPlayerAbandon;
    public final Hook<PlayerOutHook> onPlayerOut;
    public final Hook<BeforeDisposeHook> beforeDispose;
    public final Hook<TimePassedOneSecondHook> onGameTimePassedOneSecond;
    public final Hook<PlayerAbilitiesUpdatedHook> onPlayerAbilitiesUpdated;

    public GameHooks() {
        this.afterStart = Hook.create();
        this.onStop = Hook.create();
        this.onPlayerReconnect = Hook.create();
        this.onPlayerDisconnect = Hook.create();
        this.onPlayerCaught = Hook.create();
        this.onPlayerAbandon = Hook.create();
        this.onPlayerOut = Hook.create();
        this.beforeDispose = Hook.create();
        this.onGameTimePassedOneSecond = Hook.create();
        this.onPlayerAbilitiesUpdated = Hook.create();
    }

    @Override
    public void dispose() { // run dispose method of all defined hooks there
        afterStart.dispose();
        onStop.dispose();
        onPlayerReconnect.dispose();
        onPlayerDisconnect.dispose();
        onPlayerCaught.dispose();
        onPlayerAbandon.dispose();
        onPlayerOut.dispose();
        beforeDispose.dispose();
        onGameTimePassedOneSecond.dispose();
        onPlayerAbilitiesUpdated.dispose();
    }
}
