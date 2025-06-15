package snw.rfm.api.abc;

import org.jetbrains.annotations.Nullable;

public record Position(@Nullable ILevel level, Vec3D position) {
}
