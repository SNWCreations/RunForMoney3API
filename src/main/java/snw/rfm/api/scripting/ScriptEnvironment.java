package snw.rfm.api.scripting;

import org.bukkit.entity.Player;
import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.game.pack.GamePack;

import javax.script.ScriptException;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

@SuppressWarnings("unused") // Reserved for scripts
public interface ScriptEnvironment {
    GamePack getSelfGamePack();

    GamePack getOtherPack(String identifier);

    void runScriptFromSelfPack(String resourceLocation) throws IOException, ScriptException;

    Object resolveJavaClass(String className);

    MessageHandler getMessageHandler();

    Logger getLogger();

    IGamePlayer getGamePlayer(UUID uuid);

    IGamePlayer getGamePlayer(Player handle);
}
