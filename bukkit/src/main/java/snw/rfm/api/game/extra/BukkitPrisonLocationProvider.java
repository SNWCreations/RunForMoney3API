package snw.rfm.api.game.extra;

import org.bukkit.Location;
import org.jetbrains.annotations.Nullable;
import snw.rfm.api.game.IBukkitGamePlayer;

public interface BukkitPrisonLocationProvider extends PrisonLocationProvider {
    @Nullable Location getPrisonLocationInternal();

    void setPrisonLocationInternal(@Nullable Location location);

    void goPrisonInNextTick(IBukkitGamePlayer who);
}
