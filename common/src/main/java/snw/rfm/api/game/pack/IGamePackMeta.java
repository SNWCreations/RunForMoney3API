package snw.rfm.api.game.pack;

import java.util.List;

public interface IGamePackMeta {
    String identifier();

    int packVersion();

    String scriptLanguage();

    String entrypoint();

    List<String> authors();
}
