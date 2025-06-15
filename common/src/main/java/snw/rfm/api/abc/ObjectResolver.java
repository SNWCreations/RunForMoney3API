package snw.rfm.api.abc;

import org.jetbrains.annotations.Nullable;

public interface ObjectResolver {
    @Nullable ILevel getLevel(String levelKey);
}
