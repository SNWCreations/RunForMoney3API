package snw.rfm.api.game.launch;

import snw.rfm.api.abc.ILevel;
import snw.rfm.api.game.IGame;
import snw.rfm.api.game.IGameTeamManager;
import snw.rfm.api.game.init.GameInitialDataProvider;
import snw.rfm.api.util.Either;

import java.util.Collection;

public interface GameLauncher {
    GameInitialDataProvider.Mutable getInitialDataProvider();

    IGameTeamManager getTeamManager();

    Either<? extends IGame, Collection<String>> startGame(ILevel level);
}
