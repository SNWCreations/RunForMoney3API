package snw.rfm.api.task;

import snw.rfm.api.interfaces.Disposable;

public interface ITaskManager extends Disposable {
    void registerTask(TaskHandle task);

    void startAndRegisterTask(GameTask task);

    void removeTask(TaskHandle task);
}
