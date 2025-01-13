package snw.rfm.api.scripting;

import org.bukkit.entity.Player;

public interface MessageHandler {
    void sendMessage(Player receiver, String messageKey, Object... args);
}
