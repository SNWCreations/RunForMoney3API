package snw.rfm.api.task;

import org.bukkit.scheduler.BukkitTask;
import snw.rfm.api.interfaces.Disposable;

public interface ITaskManager extends Disposable {
    void registerTask(TaskHandle task);

    void registerTask(BukkitTask task);

    void startAndRegisterTask(GameTask task);

    void removeTask(TaskHandle task);
}
