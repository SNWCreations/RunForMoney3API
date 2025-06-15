package snw.rfm.api.game.extra;

import org.jetbrains.annotations.Nullable;
import snw.rfm.api.abc.Position;

public interface AbandonBlockLocationProvider {
    @Nullable Position getAbandonBlockLocation();

    void setAbandonBlockLocation(@Nullable Position location);
}
