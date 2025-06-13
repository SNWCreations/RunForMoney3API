package snw.rfm.api.game.extra;

import org.bukkit.Location;
import org.jetbrains.annotations.Nullable;

public interface AbandonBlockLocationProvider {
    @Nullable Location getAbandonBlockLocation();

    void setAbandonBlockLocation(@Nullable Location location);
}
