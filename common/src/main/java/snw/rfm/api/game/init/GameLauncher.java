package snw.rfm.api.game.init;

import snw.rfm.api.abc.ILevel;
import snw.rfm.api.game.IGame;
import snw.rfm.api.util.Either;

import java.util.Collection;

public interface GameLauncher {
    GameInitialDataProvider getInitialDataProvider();

    Either<? extends IGame, Collection<String>> startGame(ILevel level);
}
