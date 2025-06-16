package snw.rfm.api;

import org.jetbrains.annotations.Nullable;
import snw.rfm.api.abc.ObjectResolver;
import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.game.init.GameLauncher;

import java.util.UUID;

public interface IRFMPlugin {
    boolean isDisabling();

    IGamePlayer getGamePlayer(UUID uuid);

    @Nullable // null is returned if audience not found
    String getTranslationEntry(UUID audience, String key);

    ObjectResolver getObjectResolver();

    GameLauncher getGameLauncher();
}
