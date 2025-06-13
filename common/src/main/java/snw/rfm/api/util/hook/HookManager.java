package snw.rfm.api.util.hook;

import org.jetbrains.annotations.ApiStatus;
import snw.rfm.api.game.pack.GamePack;

import java.util.HashSet;
import java.util.Set;

@ApiStatus.Internal
public final class HookManager {
    static final Set<Hook<?>> allHooks = new HashSet<>();

    public static void disposeHandlersFrom(GamePack pack) {
        for (Hook<?> hook : allHooks) {
            hook.disposeHandlersFrom(pack);
        }
    }

    private HookManager() {
    }
}
