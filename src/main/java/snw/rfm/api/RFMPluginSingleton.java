package snw.rfm.api;

import com.google.common.base.Preconditions;

public final class RFMPluginSingleton {
    private static IRFMPlugin plugin;

    public static IRFMPlugin getPlugin() {
        Preconditions.checkState(plugin != null,
                "Plugin not enabled yet");
        return plugin;
    }

    public static void setPlugin(IRFMPlugin plugin) {
        if (plugin != null) {
            Preconditions.checkState(RFMPluginSingleton.plugin == null,
                    "Cannot redefine plugin singleton");
        } else {
            if (RFMPluginSingleton.plugin != null) {
                Preconditions.checkState(RFMPluginSingleton.plugin.isDisabling(),
                        "Cannot release plugin object when plugin is still working");
            }
        }
        RFMPluginSingleton.plugin = plugin;
    }

    private RFMPluginSingleton() {
    }
}
