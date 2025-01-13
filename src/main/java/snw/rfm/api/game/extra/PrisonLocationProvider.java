package snw.rfm.api.game.extra;

import org.bukkit.Location;
import org.jetbrains.annotations.Nullable;
import snw.rfm.api.game.IGamePlayer;

public interface PrisonLocationProvider {
    @Nullable Location getPrisonLocation();

    void setPrisonLocation(@Nullable Location location);

    void goPrisonInNextTick(IGamePlayer who);
}
