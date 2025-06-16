package snw.rfm.api.game.launch;

import lombok.NonNull;
import org.bukkit.World;
import snw.rfm.api.game.IGame;
import snw.rfm.api.game.init.GameLauncher;
import snw.rfm.api.util.Either;

import java.util.Collection;

public interface BukkitGameLauncher extends GameLauncher, StartCondition {
    // return a collection of error messages when game cannot be started
    @NonNull Either<? extends IGame, Collection<String>> startGame(World world);
}
