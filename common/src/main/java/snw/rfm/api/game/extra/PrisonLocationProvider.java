package snw.rfm.api.game.extra;

import org.jetbrains.annotations.Nullable;
import snw.rfm.api.abc.Position;
import snw.rfm.api.game.IGamePlayer;

public interface PrisonLocationProvider {
    @Nullable Position getPrisonLocation();

    void setPrisonLocation(@Nullable Position location);

    void goPrisonInNextTick(IGamePlayer who);
}
