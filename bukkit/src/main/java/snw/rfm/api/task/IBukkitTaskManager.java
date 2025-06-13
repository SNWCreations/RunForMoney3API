package snw.rfm.api.task;

import org.bukkit.scheduler.BukkitTask;

public interface IBukkitTaskManager extends ITaskManager {
    void registerTask(BukkitTask task);
}
