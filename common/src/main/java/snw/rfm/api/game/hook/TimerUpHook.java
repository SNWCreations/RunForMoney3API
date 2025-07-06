package snw.rfm.api.game.hook;

import snw.rfm.api.time.ITimer;

public interface TimerUpHook {
    void handle(ITimer timer);
}
