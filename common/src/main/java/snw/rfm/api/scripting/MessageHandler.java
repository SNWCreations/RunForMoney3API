package snw.rfm.api.scripting;

public interface MessageHandler<P> {
    void sendMessage(P receiver, String messageKey, Object... args);
}
