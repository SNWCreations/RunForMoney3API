package snw.rfm.api.game.extra;

import org.bukkit.Location;
import org.jetbrains.annotations.Nullable;

public interface BukkitAbandonBlockLocationProvider extends AbandonBlockLocationProvider {
    @Nullable Location getAbandonBlockLocationInternal();

    void setAbandonBlockLocationInternal(@Nullable Location location);
}
