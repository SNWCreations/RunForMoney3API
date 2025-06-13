package snw.rfm.api.scripting;

import org.jetbrains.annotations.Range;

public final class GlobalObjects {
    @Range(from = 1L, to = Long.MAX_VALUE)
    public static final long API_VERSION;

    static {
        API_VERSION = 2;
    }

    private GlobalObjects() {
    }
}
