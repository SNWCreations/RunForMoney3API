package snw.rfm.api.abc;

import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.jetbrains.annotations.Nullable;

import static java.util.Objects.requireNonNull;

public final class BukkitABCs {
    private BukkitABCs() {
    }

    public static @Nullable ILevel fromBukkitOrNull(@Nullable World world) {
        return world == null ? null : new BukkitLevel(world);
    }
    
    public static @Nullable Position fromBukkitOrNull(@Nullable Location bukkit) {
        if (bukkit == null) {
            return null;
        }
        final ILevel level = fromBukkitOrNull(bukkit.getWorld());
        final double x = bukkit.getX();
        final double y = bukkit.getY();
        final double z = bukkit.getZ();
        final Vec3D pos = new Vec3D(x, y, z);
        return new Position(level, pos);
    }

    public static @Nullable World toBukkitOrNull(@Nullable ILevel level) {
        if (level instanceof BukkitLevel bukkit) {
            return bukkit.handle();
        } else {
            return null;
        }
    }

    public static @Nullable Location toBukkitOrNull(@Nullable Position abc) {
        if (abc != null) {
            final World world = toBukkitOrNull(abc.level());
            final Vec3D position = abc.position();
            final double x = position.x();
            final double y = position.y();
            final double z = position.z();
            return new Location(world, x, y, z);
        }
        return null;
    }

    public static @Nullable ILevel fromBukkitOrFail(@Nullable World world) {
        return world == null ? null : requireNonNull(fromBukkitOrNull(world), "Invalid level");
    }

    public static @Nullable Position fromBukkitOrFail(@Nullable Location bukkit) {
        return bukkit == null ? null : requireNonNull(fromBukkitOrNull(bukkit), "Invalid position");
    }

    public static @Nullable World toBukkitOrFail(@Nullable ILevel level) {
        return level == null ? null : requireNonNull(toBukkitOrNull(level), "Invalid level");
    }

    public static @Nullable Location toBukkitOrFail(@Nullable Position abc) {
        return abc == null ? null : requireNonNull(toBukkitOrNull(abc), "Invalid position");
    }

    public static NamespacedKey keyOrFail(String key) {
        return requireNonNull(NamespacedKey.fromString(key), "Invalid key");
    }
}
