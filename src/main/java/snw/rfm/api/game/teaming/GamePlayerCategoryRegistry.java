package snw.rfm.api.game.teaming;

import java.util.Optional;

public interface GamePlayerCategoryRegistry<T extends GamePlayerCategory> {

    Optional<T> get(String key);

    // register is maintained by implementations

}
