package snw.rfm.task;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;
import snw.rfm.api.RFMPluginSingleton;

import java.util.function.Consumer;

public final class TaskHelper {
    private static final BukkitScheduler scheduler;
    
    static {
        scheduler = Bukkit.getScheduler();
    }

    public static BukkitTask runTask(Runnable task) throws IllegalArgumentException {
        return scheduler.runTask(RFMPluginSingleton.getPlugin(), task);
    }

    public static void runTask(Consumer<BukkitTask> task) throws IllegalArgumentException {
        scheduler.runTask(RFMPluginSingleton.getPlugin(), task);
    }

    public static BukkitTask runTaskAsynchronously(Runnable task) throws IllegalArgumentException {
        return scheduler.runTaskAsynchronously(RFMPluginSingleton.getPlugin(), task);
    }

    public static void runTaskAsynchronously(Consumer<BukkitTask> task) throws IllegalArgumentException {
        scheduler.runTaskAsynchronously(RFMPluginSingleton.getPlugin(), task);
    }

    public static BukkitTask runTaskLater(Runnable task, long delay) throws IllegalArgumentException {
        return scheduler.runTaskLater(RFMPluginSingleton.getPlugin(), task, delay);
    }

    public static void runTaskLater(Consumer<BukkitTask> task, long delay) throws IllegalArgumentException {
        scheduler.runTaskLater(RFMPluginSingleton.getPlugin(), task, delay);
    }

    public static BukkitTask runTaskLaterAsynchronously(Runnable task, long delay) throws IllegalArgumentException {
        return scheduler.runTaskLaterAsynchronously(RFMPluginSingleton.getPlugin(), task, delay);
    }

    public static void runTaskLaterAsynchronously(Consumer<BukkitTask> task, long delay) throws IllegalArgumentException {
        scheduler.runTaskLaterAsynchronously(RFMPluginSingleton.getPlugin(), task, delay);
    }

    public static BukkitTask runTaskTimer(Runnable task, long delay, long period) throws IllegalArgumentException {
        return scheduler.runTaskTimer(RFMPluginSingleton.getPlugin(), task, delay, period);
    }

    public static void runTaskTimer(Consumer<BukkitTask> task, long delay, long period) throws IllegalArgumentException {
        scheduler.runTaskTimer(RFMPluginSingleton.getPlugin(), task, delay, period);
    }

    public static BukkitTask runTaskTimerAsynchronously(Runnable task, long delay, long period) throws IllegalArgumentException {
        return scheduler.runTaskTimerAsynchronously(RFMPluginSingleton.getPlugin(), task, delay, period);
    }

    public static void runTaskTimerAsynchronously(Consumer<BukkitTask> task, long delay, long period) throws IllegalArgumentException {
        scheduler.runTaskTimerAsynchronously(RFMPluginSingleton.getPlugin(), task, delay, period);
    }
}
