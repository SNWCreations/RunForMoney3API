package snw.rfm.api.game.teaming;

import java.util.Optional;

public interface IGamePlayerGroupManager<T extends GamePlayerGroup> extends GamePlayerCategoryRegistry<T> {
    T register(String key);

    Optional<T> unregister(String key);
}
