package snw.rfm.api.abc;

import org.bukkit.World;

public record BukkitLevel(World handle) implements ILevel {
    @Override
    public String getKey() {
        return handle.getKey().toString();
    }
}
