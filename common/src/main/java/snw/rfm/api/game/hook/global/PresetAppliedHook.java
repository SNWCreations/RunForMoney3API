package snw.rfm.api.game.hook.global;

import snw.rfm.api.game.launch.GameLauncher;

public interface PresetAppliedHook {
    void handle(GameLauncher launcher);
}
