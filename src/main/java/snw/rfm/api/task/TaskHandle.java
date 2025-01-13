package snw.rfm.api.task;

public interface TaskHandle {
    void cancel() throws IllegalStateException;

    boolean isCancelled();

    default void cancelIfPossible() {
        if (!isCancelled()) {
            cancel();
        }
    }
}
