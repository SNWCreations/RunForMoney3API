package snw.rfm.api.game.hook.global;

import snw.rfm.api.game.init.GameLauncher;

public interface PresetAppliedHook {
    void handle(GameLauncher launcher);
}
