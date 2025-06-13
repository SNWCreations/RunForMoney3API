package snw.rfm.api.scripting;

import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.game.pack.GamePack;

import javax.script.ScriptException;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Logger;

@SuppressWarnings("unused") // Reserved for scripts
public interface ScriptEnvironment<P> {
    GamePack getSelfGamePack();

    GamePack getOtherPack(String identifier);

    void runScriptFromSelfPack(String resourceLocation) throws IOException, ScriptException;

    Object resolveJavaClass(String className);

    MessageHandler<P> getMessageHandler();

    Logger getLogger();

    IGamePlayer getGamePlayer(UUID uuid);
}
