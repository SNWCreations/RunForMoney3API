package snw.rfm.api.interfaces;

public interface Lifecycle {

    void start() throws IllegalStateException;

    void stop() throws IllegalStateException;

    boolean isRunning();

    void checkRunning() throws IllegalStateException;

}
