package snw.rfm.api.game.hook;

import snw.rfm.api.time.ITimer;

public interface TimerFreezeStateChangedHook {
    void handle(ITimer timer);
}
